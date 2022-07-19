package com.shubao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shubao.pojo.User;
import com.shubao.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Iterator;
import java.util.Set;

@SpringBootTest
class ApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    void test01() throws Exception {
        // redisTemplate.opsForValue().set("name", "zhangsan");
        // System.out.println("redisTemplate.hasKey(\"name\") = " + redisTemplate.hasKey("name"));
        // System.out.println("redisTemplate.opsForValue().get(\"name\") = " + redisTemplate.opsForValue().get("name"));

        Set keys = redisTemplate.keys("*");
        Iterator iterator = keys.iterator();

        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            System.out.println("redisUtil.get(iterator.next()) = " + redisUtil.get((String) iterator.next()));
        }
    }


    @Test
    public void test02() throws JsonProcessingException {
        User user = new User("张三", 18);
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

    @Test
    public void test03() throws JsonProcessingException {
        User user = new User("张三", 18);
        String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user", jsonUser);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }



}

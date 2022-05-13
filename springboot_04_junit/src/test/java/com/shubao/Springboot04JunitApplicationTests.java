package com.shubao;

import com.shubao.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试类如果存在于引导类所在的包或子包中，无需指定引导类
 * 测试类如果不存在于引导类所在的包或子包中，需要通过class属性指定引导类
 * @author Chris
 * @date 2022年5月13日
 */
@SpringBootTest//(classes = Springboot04JunitApplication.class)
// @Contextconfiguration(classes = Springboot04JunitApplication.class)
class Springboot04JunitApplicationTests {

    // 1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;


    @Test
    void contextLoads() {
        // 2.调用要测试的方法
        bookDao.save();
    }

}

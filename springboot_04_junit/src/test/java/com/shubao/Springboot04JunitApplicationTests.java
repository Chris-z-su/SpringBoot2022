package com.shubao;

import com.shubao.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
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

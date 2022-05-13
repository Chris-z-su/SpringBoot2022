package com.shubao.controller;

import com.shubao.domain.MyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: BookController 控制器类  Rest模式
 * @author: chris
 * @create: 2022-05-11 19:07
 * @since JDK1.8
 **/
@RestController
@RequestMapping("/books")
public class BookController {

    // 读取yml配置文件
    @Value("${country}")
    private String country;

    // 使用Environment对象读取配置文件
    @Autowired
    private Environment environment;

    @Autowired
    private MyDatasource myDatasource;

    @GetMapping
    public String getAll() {
        System.out.println("SpringBoot is running...");
        System.out.println(environment.getProperty("country"));
        System.out.println("myDatasource = " + myDatasource);
        return "Hello Books, " + country;
    }

}

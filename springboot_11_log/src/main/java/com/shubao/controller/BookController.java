package com.shubao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    //创建记录日志的对象
    private static Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById() {
        System.out.println("SpringBoot is running...");

        //记录日志
        logger.info("log info...");
        logger.debug("log debug...");
        logger.error("log error...");
        logger.warn("log warn...");

        return "Hello Books";
    }

}

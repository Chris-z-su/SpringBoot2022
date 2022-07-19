package com.shubao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description:
 * @author: chris
 * @create: 2022-07-13 13:56
 * @since JDK1.8
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return "123";
    }

    @GetMapping("/")
    public String getPage(){
        return "hello";
    }
}

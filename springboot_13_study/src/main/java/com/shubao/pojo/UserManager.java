package com.shubao.pojo;


import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description:
 * @author: chris
 * @create: 2022-07-13 17:00
 * @since JDK1.8
 **/
@Component
public class UserManager {

    private String username;

    public UserManager() {
        System.out.println("User无参构造器：" + this);
    }

    public UserManager(String username) {
        this.username = username;
        System.out.println("User有参构造器：" + this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

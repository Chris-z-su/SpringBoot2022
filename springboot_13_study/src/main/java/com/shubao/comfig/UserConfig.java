package com.shubao.comfig;

import com.shubao.pojo.UserManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description:
 * @author: chris
 * @create: 2022-07-13 17:01
 * @since JDK1.8
 **/
@Configuration
public class UserConfig {
    @Value("${user.name}")
    private String username;

    @Bean
    public UserManager userManager(){
        return new UserManager(username);
        // return new UserManager();
    }
}

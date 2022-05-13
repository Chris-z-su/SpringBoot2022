package com.shubao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合SpringBoot和Mybatis：
 *  1.核心配置：数据库相关的连接信息（连什么？连谁？什么权限？）
 *  2.映射配置：Sql映射（XML/注解）
 */
@SpringBootApplication
public class Springboot05MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05MybatisApplication.class, args);
    }

}

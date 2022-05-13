package com.shubao.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: 数据库连接信息
 * @author: chris
 * @create: 2022-05-12 11:16
 * @since JDK1.8
 **/
// 1.定义数据模型封装yaml文件中的对应数据
// 2.定义为spring管理的bean
@Component
@ConfigurationProperties(prefix = "datasource")
@Data
public class MyDatasource {
    private String driver;
    private String url;
    private String username;
    private String password;
}

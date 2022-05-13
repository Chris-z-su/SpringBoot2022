package com.shubao.domain;

import lombok.Data;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: Book实体类
 * @author: chris
 * @create: 2022-05-13 11:43
 * @since JDK1.8
 **/
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}

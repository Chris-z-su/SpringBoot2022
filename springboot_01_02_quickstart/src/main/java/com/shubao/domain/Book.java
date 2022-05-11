package com.shubao.domain;

import lombok.Data;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: Book类
 * @author: chris
 * @create: 2022-05-11 20:56
 * @since JDK1.8
 **/
@Data
public class Book {
    private String name;
    private String author;
    private Double price;
}

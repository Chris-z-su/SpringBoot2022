package com.shubao.pojo;

import lombok.Data;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: 学生实体类
 * @author: chris
 * @create: 2022-07-13 16:58
 * @since JDK1.8
 **/
@Data
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private String age;
}

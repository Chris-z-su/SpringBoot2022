package com.shubao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: user实体类
 * @author: chris
 * @create: 2022-06-22 20:27
 * @since JDK1.8
 **/
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    private String name;

    private int age;
}

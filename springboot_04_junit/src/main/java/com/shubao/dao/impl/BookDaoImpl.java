package com.shubao.dao.impl;

import com.shubao.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: BookDaoImpl
 * @author: chris
 * @create: 2022-05-12 11:31
 * @since JDK1.8
 **/
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("BookDaoImpl.save");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {
        System.out.println("BookDaoImpl.find");
    }
}

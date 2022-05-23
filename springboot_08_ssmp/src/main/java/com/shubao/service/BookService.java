package com.shubao.service;

import com.shubao.domain.Book;

import java.util.List;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: BookService业务层
 * @author: chris
 * @create: 2022-05-16 10:10
 * @since JDK1.8
 **/
public interface BookService {
    // 保存操作
    Boolean save(Book book);
    // 更新操作
    Boolean update(Book book);
    // 删除操作
    Boolean delete(Integer id);
    // 根据id查询
    Book findById(Integer id);
    // 查询所有
    List<Book> findAll();
    // 分页查询
    List<Book> findByPage(Integer page,Integer size);
    // 模糊查询
    List<Book> findByName(String name);
}

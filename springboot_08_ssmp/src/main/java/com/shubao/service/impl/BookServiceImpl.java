package com.shubao.service.impl;

import com.shubao.dao.BookDao;
import com.shubao.domain.Book;
import com.shubao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: BookService实现类
 * @author: chris
 * @create: 2022-05-16 10:13
 * @since JDK1.8
 **/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.selectList(null);
    }

    @Override
    public List<Book> findByPage(Integer page, Integer size) {
        return null;
    }

    @Override
    public List<Book> findByName(String name) {
        return null;
    }
}

package com.shubao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shubao.dao.BookDao;
import com.shubao.domain.Book;
import com.shubao.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: IBookService实现类
 * @author: chris
 * @create: 2022-05-16 11:05
 * @since JDK1.8
 **/
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Book> findByPage(int currentPage, int pageSize, Book book) {
        // IPage page = new Page(currentPage, pageSize);
        // bookDao.selectPage(page, null);

        // 条件封装
        LambdaQueryWrapper<Book> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(!Strings.isBlank(book.getType()), Book::getType, book.getType());
        queryWrapper.like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName());
        queryWrapper.like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());

        IPage<Book> page = new Page<>(currentPage, pageSize);
        bookDao.selectPage(page, queryWrapper);

        return page;
    }
}

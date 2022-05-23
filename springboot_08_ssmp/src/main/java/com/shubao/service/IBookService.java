package com.shubao.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shubao.domain.Book;

public interface IBookService extends IService<Book> {

    IPage<Book> findByPage(int currentPage, int pageSize, Book book);
}

package com.shubao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shubao.dao.BookDao;
import com.shubao.domain.Book;
import com.shubao.service.IBookService;
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
}

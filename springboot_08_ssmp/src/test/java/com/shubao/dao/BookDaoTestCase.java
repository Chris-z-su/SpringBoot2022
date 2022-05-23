package com.shubao.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shubao.domain.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: BookDao测试用例
 * @author: chris
 * @create: 2022-05-13 13:57
 * @since JDK1.8
 **/
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    // 根据id查询
    @Test
    public void testFindBookById(){
        System.out.println(bookDao.selectById(1));
    }

    // 查询所有
    @Test
    public void testFindAll(){
        System.out.println(bookDao.selectList(null));
    }

    // 根据分页查询
    @Test
    public void testFindByPage(){
        IPage page = new Page(1, 5);
        bookDao.selectPage(page,null);
        System.out.println("page.getTotal() = " + page.getTotal());// 总记录数
        System.out.println("page.getPages() = " + page.getPages());// 总页数
        System.out.println("page.getCurrent() = " + page.getCurrent());// 当前页
        System.out.println("page.getSize() = " + page.getSize());// 每页显示的记录数
        System.out.println("page.getRecords() = " + page.getRecords());// 当前页的数据
    }

    // 根据条件查询
    @Test
    public void testFindByCondition(){
        QueryWrapper<Book> query = new QueryWrapper<>();
        // query.eq("type","编程语言");
        query.like("name","Spring");
        System.out.println(bookDao.selectList(query));
    }

    // 根据条件查询，解决属性名错误问题
    @Test
    public void testFindByConditionError(){
        String name = "Spring";
        LambdaQueryWrapper<Book> query = new LambdaQueryWrapper<>();
        // query.eq(Book::getType,"编程语言");
        // 方式一：
        // if(name != null && !"".equals(name)){
        //     query.like(Book::getName, name);
        // }
        // 方式二：
        query.like(Strings.isNotEmpty(name), Book::getName, name);
        System.out.println(bookDao.selectList(query));
    }

    // 插入
    @Test
    public void testInsert(){
        Book book = new Book();
        book.setType("编程语言");
        book.setName("Spring Boot");
        book.setDescription("Spring Boot 是一个开源的企业级构建工具");
        bookDao.insert(book);
    }

    // 更新
    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(19);
        book.setType("编程语言");
        book.setName("Spring Boot");
        book.setDescription("Spring Boot 是一个开源的企业级构建工具。");
        bookDao.updateById(book);
    }

    // 删除
    @Test
    public void testDelete(){
        bookDao.deleteById(19);
    }
}


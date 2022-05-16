package com.shubao.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceImplTest {

    @Autowired
    private IBookService iBookService;

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
        System.out.println("iBookService.getById(1) = " + iBookService.getById(1));
    }

    @Test
    void findAll() {
        System.out.println("iBookService.list() = " + iBookService.list());
    }
}
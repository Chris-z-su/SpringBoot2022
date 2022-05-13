package com.shubao.dao;

import com.shubao.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 数据库sql映射需要添加注解@Mapper被容器识别到
 */
@Mapper
public interface BookDao {

    // 根据id查询图书
    @Select("select * from tbl_book where id = #{id}")
    public Book getBookById(Integer id);
}

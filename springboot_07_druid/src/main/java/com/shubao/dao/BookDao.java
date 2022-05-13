package com.shubao.dao;

import com.shubao.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 数据库sql映射需要添加注解@Mapper被容器识别到
 *
 * 整合第三方技术通用方式：
 *  1.导入对应的starter
 *  2.根据提供的配置格式，配置非默认值对应的配置项
 */
@Mapper
public interface BookDao {

    // 根据id查询图书
    @Select("select * from tbl_book where id = #{id}")
    public Book getBookById(Integer id);
}

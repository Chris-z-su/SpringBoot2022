package com.shubao.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shubao.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据库sql映射需要添加注解@Mapper被容器识别到
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}

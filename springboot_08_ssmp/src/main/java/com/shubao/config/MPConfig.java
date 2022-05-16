package com.shubao.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: Mybatis分页配置类
 * @author: chris
 * @create: 2022-05-16 09:50
 * @since JDK1.8
 **/
@Configuration
public class MPConfig {

    @Bean
    public MybatisPlusInterceptor getMybatisPlusInterceptor() {
        // 内部是动态的拼写sql语句
        // 1.定义MP拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 2.添加具体的拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

}

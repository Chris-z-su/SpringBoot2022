package com.shubao.utils;

import com.shubao.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: SpringMVC的异常处理器
 * @author: chris
 * @create: 2022-05-18 18:38
 * @since JDK1.8
 **/
// @ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public ResultVO exception(Exception e){
        // 记录日志
        // 通知运维人员
        // 通知开发人员
        // return ResultVOUtil.error(404, e.getMessage());
        return ResultVOUtil.error(404, "服务器故障，请稍后再试！");
    }

}

package com.xingkong.star.base.handler;

import com.xingkong.star.base.domain.PlainResult;
import com.xingkong.star.base.exception.ParamsError;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public PlainResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        if (e instanceof ParamsError) {
            return new PlainResult(1000, "参数错误：" + e.getMessage());
        } else if (e instanceof InvalidDataAccessApiUsageException) {
            return new PlainResult(1000, "参数错误：" + e.getMessage());
        } else {
            return new PlainResult(-1, e.getMessage());
        }
    }
}
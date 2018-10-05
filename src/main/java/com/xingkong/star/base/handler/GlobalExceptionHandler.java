package com.xingkong.star.base.handler;

import com.xingkong.star.base.domain.PlainResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public PlainResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return new PlainResult(9999, e.getMessage());
    }
}
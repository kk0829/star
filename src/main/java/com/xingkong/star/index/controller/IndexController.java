package com.xingkong.star.index.controller;

import com.xingkong.star.base.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kk
 */
@RestController
public class IndexController extends BaseController {

    @GetMapping(value = "/")
    public String getIndexHtml() {
        return "hello world";
    }
}

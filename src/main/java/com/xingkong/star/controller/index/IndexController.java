package com.xingkong.star.controller.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String getIndexHtml() {
        return "Hello world";
    }
}

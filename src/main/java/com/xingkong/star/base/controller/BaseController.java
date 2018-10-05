package com.xingkong.star.base.controller;

import com.xingkong.star.base.domain.PlainResult;

public class BaseController {

    public PlainResult success() {
        return new PlainResult(0, "成功");
    }

    public PlainResult success(Object data) {
        return new PlainResult(0, "成功", data);
    }

    public PlainResult emptyRecord() {
        return new PlainResult(-1, "记录不存在");
    }

    public PlainResult error(Integer code, String msg) {
        return new PlainResult(code, msg);
    }

    public PlainResult json(Integer code, String msg, Object data) {
        return new PlainResult(code, msg, data);
    }
}

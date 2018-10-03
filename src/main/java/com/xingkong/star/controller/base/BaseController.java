package com.xingkong.star.controller.base;

import com.xingkong.star.domain.PlainResult;

public class BaseController {

    public PlainResult success() {
        return new PlainResult(0, "ok");
    }

    public PlainResult success(Object data) {
        return new PlainResult(0, "ok", data);
    }

    public PlainResult error(Integer code, String msg) {
        return new PlainResult(code, msg);
    }

    public PlainResult json(Integer code, String msg, Object data) {
        return new PlainResult(code, msg, data);
    }
}

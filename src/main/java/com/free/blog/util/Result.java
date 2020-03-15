package com.free.blog.util;

import lombok.Data;

@Data
public class Result {

    private Integer errorCode;//错误码，1表示成功，0表示失败
    private String msg;//错误信息

    public Result() {
    }

    public Result(Integer errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

}

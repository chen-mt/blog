package com.free.blog.util;

import lombok.Data;

@Data
public class Result {

    private boolean status;//是否成功
    private Integer errorCode;//错误码
    private String msg;//错误信息

    public Result() {
    }

    public Result(boolean status, Integer errorCode, String msg) {
        this.status = status;
        this.errorCode = errorCode;
        this.msg = msg;
    }

}

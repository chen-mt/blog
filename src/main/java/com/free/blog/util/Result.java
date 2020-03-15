package com.free.blog.util;

        import lombok.Data;

@Data
public class Result {

    private Integer errorCode;//错误码，1表示成功，0表示失败
    private Object data;//返回信息

    public Result() {
    }

    public Result(Integer errorCode, Object data) {
        this.errorCode = errorCode;
        this.data = data;
    }

}

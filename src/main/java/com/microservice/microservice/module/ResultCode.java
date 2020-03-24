package com.microservice.microservice.module;

/**
 * @program: microservice
 * @description: 返回状态吗
 * @author: ws
 * @create: 2020-03-24 10:04
 **/
public enum ResultCode {
    R_2000_SUCCESS(2000, "the request is success"),
    R_4000_FAIL(4000, "the request is fail");

    private Integer code;

    private String reason;

    ResultCode(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

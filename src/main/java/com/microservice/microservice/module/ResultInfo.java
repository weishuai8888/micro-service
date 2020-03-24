package com.microservice.microservice.module;

/**
 * @program: microservice
 * @description: 返回包装类
 * @author: ws
 * @create: 2020-03-24 09:55
 **/
public class ResultInfo {
    private Integer code;
    private String message;
    private Object result;

    public ResultInfo(){
        super();
    }

    public ResultInfo(int code, String message, Object result){
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}

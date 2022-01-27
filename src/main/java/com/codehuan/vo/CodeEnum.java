package com.codehuan.vo;

/**
 * @author ZhangHuan created on 2022/1/27 14:04
 * @version 1.0
 * @Description 状态码枚举类
 * @email: 1730272469@qq.com
 */
public enum CodeEnum {
    /**
     * 成功
     */
    SUCCESS(200, "OK"),

    /**
     * 参数不齐全或参数错误
     */
    BAD_REQUEST(400,"参数不正确");

    private Integer code;
    private String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
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


}

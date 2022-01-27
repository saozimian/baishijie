package com.codehuan.pojo;

import com.codehuan.vo.CodeEnum;

import java.io.Serializable;

/**
 * @author ZhangHuan created on 2022/1/27 13:57
 * @version 1.0
 * @Description TODO
 * @email: 1730272469@qq.com
 */
public class Result<T> implements Serializable {

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回封装数据
     */
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public Result(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    //不返回数据构造方法
    public Result(CodeEnum codeEnum) {
        this.status = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    //返回数据构造方法
    public Result(CodeEnum codeEnum, T data) {
        this(codeEnum);
        this.data = data;
    }

    //请求成功（不返回数据）
    public static <T> Result<T> success() {
        return new Result<T>(CodeEnum.SUCCESS);
    }

    //请求成功（返回数据）
    public static <T> Result<T> success(T data) {
        return new Result<T>(CodeEnum.SUCCESS, data);
    }

    //参数格式不正确
    public static <T> Result<T> badRequest() {
        return new Result<T>(CodeEnum.BAD_REQUEST);
    }


}

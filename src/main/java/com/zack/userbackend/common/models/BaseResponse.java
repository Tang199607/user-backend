package com.zack.userbackend.common.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 基础响应
 *
 * @author TangYong
 * @date 2023年05月21日 16:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -3022548686568404827L;

    //状态码
    private int code;
    //错误码
    private String message;
    //描述
    private String description;
    //响应数据
    private T data;

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public BaseResponse(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, String description, T data) {
        this.code = code;
        this.description = description;
        this.data = data;
    }
}

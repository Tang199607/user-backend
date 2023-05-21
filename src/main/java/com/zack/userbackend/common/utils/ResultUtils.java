package com.zack.userbackend.common.utils;

import com.zack.userbackend.common.models.BaseResponse;

/**
 * 响应工具类
 *
 * @author TangYong
 * @date 2023年05月21日 16:38
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(1, "success", "", data);
    }

    public static <T> BaseResponse<T> success(String description, T data) {
        return new BaseResponse<>(1, "success", description, data);
    }

    public static <T> BaseResponse<T> error(T data) {
        return new BaseResponse<>(5, "error", "", data);
    }

    public static <T> BaseResponse<T> error(String description, T data) {
        return new BaseResponse<>(5, "error", description, data);
    }

}

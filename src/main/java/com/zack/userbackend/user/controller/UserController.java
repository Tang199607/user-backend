package com.zack.userbackend.user.controller;

import com.zack.userbackend.common.models.BaseResponse;
import com.zack.userbackend.common.utils.ResultUtils;
import com.zack.userbackend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TangYong
 * @date 2023年05月21日 15:47
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 查询user列表数据
     *
     * @return com.zack.userbackend.common.models.BaseResponse
     */
    @GetMapping("/getUserList")
    public BaseResponse<Object> getUserList() {
        return ResultUtils.success(userService.getUserList());
    }
}

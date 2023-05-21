package com.zack.userbackend.user.service;

import com.zack.userbackend.models.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zack
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-05-21 15:42:28
*/
public interface UserService extends IService<User> {

    List<User> getUserList();

}

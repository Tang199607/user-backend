package com.zack.userbackend.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zack.userbackend.models.User;
import com.zack.userbackend.user.service.UserService;
import com.zack.userbackend.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zack
 * @description 针对表【user(用户)】的数据库操作Service实现
 * @createDate 2023-05-21 15:42:28
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>(User.class);
        return userMapper.selectList(queryWrapper);
    }
}





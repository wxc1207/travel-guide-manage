package com.chao.travel.guide.service.impl;

import com.chao.travel.guide.entity.User;
import com.chao.travel.guide.mapper.UserMapper;
import com.chao.travel.guide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : WXC
 * date    : 2020/12/7 17:17
 * desc    :-
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

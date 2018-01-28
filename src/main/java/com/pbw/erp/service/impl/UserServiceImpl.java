package com.pbw.erp.service.impl;

import com.pbw.erp.entity.User;
import com.pbw.erp.mapper.UserMapper;
import com.pbw.erp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User selectUserByUserId(int userId) {
        return mapper.selectUserByUserId(userId);
    }
}

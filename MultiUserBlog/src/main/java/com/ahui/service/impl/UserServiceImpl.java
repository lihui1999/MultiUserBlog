package com.ahui.service.impl;

import com.ahui.dao.IUserDao;
import com.ahui.domain.User;
import com.ahui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAllUser() {
        System.out.println("调用了service层");
        return userDao.findAllUser();
    }
}

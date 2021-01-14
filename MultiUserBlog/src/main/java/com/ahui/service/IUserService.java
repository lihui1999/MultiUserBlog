package com.ahui.service;

import com.ahui.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();
}

package com.ahui.dao;

import com.ahui.domain.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("userDao")
public interface IUserDao {

    List<User> findAllUser();
}

package com.ahui.test;

import com.ahui.dao.IUserDao;
import com.ahui.domain.User;
import com.ahui.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestUserDao {
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserDao userDao;

    /**
     * service层  测试查询全部
     */
    @Test
    public void findAllUser(){
        List<User> lists = userService.findAllUser();
        for (User list : lists) {
            System.out.println(list);
        }
    }

    /**
     * dao层  查询全部
     */
    @Test
    public void findAllUserDao(){
        List<User> list = userDao.findAllUser();
        for (User user : list) {
            System.out.println(user);
        }
    }
}

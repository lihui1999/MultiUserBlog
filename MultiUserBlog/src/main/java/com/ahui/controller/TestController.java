package com.ahui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("testController")
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/findAll")
    public String findAllUser(){
        System.out.println("执行了springmvc");
        return "success";
    }
}

package com.example.health_system.controller;

import com.example.health_system.bean.UserBean;
import com.example.health_system.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class login_controller {

    //将Service注入Web层
    @Autowired
    Userservice userservice;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userservice.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }


}

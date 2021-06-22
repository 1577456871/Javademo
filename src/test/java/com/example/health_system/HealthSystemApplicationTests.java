package com.example.health_system;

import com.example.health_system.bean.UserBean;
import com.example.health_system.service.Userservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HealthSystemApplicationTests {

    @Autowired
    Userservice userservice;
    @Test
    void contextLoads() {
        UserBean userBean = userservice.loginIn("a","a");
        System.out.println("该用户id为 ");
        System.out.println(userBean.getId());
    }

}

package com.scs.zhihu.api.service;

import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.domain.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ZhihuApiApplication.class)
class UserServiceTest {

    @Resource
    private UserService userService;
    @Test
    void login() throws Exception{

    }
}
package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.domain.dto.UserDto;
import com.scs.zhihu.api.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author zhao
 * @className UserController
 * @Description TODO
 * @Date 2020/2/8
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/login")
     Result signIn(UserDto userDto){
        return  userService.login(userDto);
    }
}

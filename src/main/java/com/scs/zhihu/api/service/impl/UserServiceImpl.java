package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.common.ResultCode;
import com.scs.zhihu.api.domain.dto.UserDto;
import com.scs.zhihu.api.domain.entity.User;
import com.scs.zhihu.api.mapper.UserMapper;
import com.scs.zhihu.api.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @author zhao
 * @className UserServiceImpl
 * @Description TODO
 * @Date 2020/2/8
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Result login(UserDto userDto) {
            User admin = null;
            try {
                admin = userMapper.findUserByMobile(userDto.getMobile());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (admin != null){
                if(DigestUtils.md5DigestAsHex(userDto.getPassword().getBytes()).equals(admin.getPassword())){
                    System.out.println(admin);
                    return Result.success(admin);
                }else {
                    return Result.failure(ResultCode.USER_PASSWORD_ERROR);
                }
            } else {
                return Result.failure(ResultCode.USER_ACCOUNT_ERROR);
            }
    }
}

package com.scs.zhihu.api.service;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.domain.dto.UserDto;

/**
 * @author zhao
 * @className UserService
 * @Description TODO
 * @Date 2020/2/8
 * @Version 1.0
 **/
public interface UserService {
    /**
     * 用户登录功能
     * @param userDto
     * @return
     */
    Result login(UserDto userDto);
}

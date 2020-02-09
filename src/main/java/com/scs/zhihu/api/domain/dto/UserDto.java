package com.scs.zhihu.api.domain.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhao
 * @className UserDto
 * @Description TODO
 * @Date 2020/2/8
 * @Version 1.0
 **/
@Data
@Builder
public class UserDto {
    private String mobile;
    private String password;

    public UserDto(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

}

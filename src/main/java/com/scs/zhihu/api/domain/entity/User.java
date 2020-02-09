package com.scs.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zhao
 * @className User
 * @Description TODO
 * @Date 2020/2/8
 * @Version 1.0
 **/
@Data
@Builder
public class User {
    private String id;
    private String mobile;
    private String email;
    private String password;
    private String name;
    private String urlToken;
    private String avatarUrl;
    private String url;
    private String headline;
    private String description;
    private Short  gender;
    private String location;
    private String business;
    private String employment;
    private String education;
    private String userCover;
    private LocalDateTime created;


}

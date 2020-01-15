package com.scs.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author zhao
 * @className Special
 * @Description TODO
 * @Date 2020/1/15
 * @Version 1.0
 **/
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}

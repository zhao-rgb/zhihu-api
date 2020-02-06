package com.scs.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhao
 * @className RoundTable
 * @Description TODO
 * @Date 2020/1/17
 * @Version 1.0
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}

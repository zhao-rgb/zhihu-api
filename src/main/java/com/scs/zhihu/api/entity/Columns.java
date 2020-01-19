package com.scs.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhao
 * @className Columns
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Data
@Builder
public class Columns {
    private Integer id;
    private String  title;
    private String  description;
    private String  url;
    private String  imageUrl;
    private Integer followers;
    private Integer articlesCount;
}

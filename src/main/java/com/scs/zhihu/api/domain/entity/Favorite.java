package com.scs.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhao
 * @className Favorite
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Data
@Builder
public class Favorite {
    private Integer id;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteupCount;
    private Integer commentCount;
}

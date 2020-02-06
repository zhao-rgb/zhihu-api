package com.scs.zhihu.api.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhao
 * @className Section
 * @Description TODO
 * @Date 2020/1/15
 * @Version 1.0
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}

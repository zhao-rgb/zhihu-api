package com.scs.zhihu.api.service;

import com.scs.zhihu.api.domain.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className SpecialService
 * @Description TODO
 * @Date 2020/1/15
 * @Version 1.0
 **/
public interface SpecialService {
    /**
     * 查询所有专题
     *
     * @return
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     *
     * @return
     */
    List<Special> selectRecent();
}

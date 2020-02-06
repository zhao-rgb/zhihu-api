package com.scs.zhihu.api.service;

import com.scs.zhihu.api.domain.vo.ExploreVo;

/**
 * @author zhao
 * @className ExploreService
 * @Description TODO
 * @Date 2020/2/6
 * @Version 1.0
 **/
public interface ExploreService {
    /**
     * 获取发现视图对象
     * @return
     */
    ExploreVo selectRecentExplore();
}

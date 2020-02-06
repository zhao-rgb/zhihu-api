package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.domain.entity.RoundTable;
import com.scs.zhihu.api.domain.vo.ExploreVo;
import com.scs.zhihu.api.mapper.ColumnsMapper;
import com.scs.zhihu.api.mapper.FavoriteMapper;
import com.scs.zhihu.api.mapper.RoundTableMapper;
import com.scs.zhihu.api.mapper.SpecialMapper;
import com.scs.zhihu.api.service.ExploreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className ExploreServiceImpl
 * @Description TODO
 * @Date 2020/2/6
 * @Version 1.0
 **/
@Service
public class ExploreServiceImpl implements ExploreService {
    @Resource
    private SpecialMapper specialMapper;
    @Resource
    private RoundTableMapper roundTableMapper;
    @Resource
    private FavoriteMapper favoriteMapper;
    @Resource
    private ColumnsMapper columnsMapper;

    @Override
    public ExploreVo selectRecentExplore() {
        ExploreVo exploreVos = ExploreVo.builder().specials(specialMapper.selectRecent())
                .roundTables(roundTableMapper.selectRecentRoundTable())
                .favorites(favoriteMapper.selectRecentFavorite())
                .columnsList(columnsMapper.selectRecentColumns()).build();
        return exploreVos;
    }
}

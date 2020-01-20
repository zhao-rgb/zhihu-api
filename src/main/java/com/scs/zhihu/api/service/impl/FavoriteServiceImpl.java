package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.Favorite;
import com.scs.zhihu.api.mapper.FavoriteMapper;
import com.scs.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className FavoriteServiceImpl
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Favorite> selectRecentFavorite() {
        return favoriteMapper.selectRecentFavorite();
    }

    @Override
    public List<Map> selectAllFavorite() {
        return favoriteMapper.selectAllFavorite();
    }

    @Override
    public List<Favorite> selectFavoriteByPage(int currentPage, int count) {
        int dealCount = (currentPage -1) * count;
        return favoriteMapper.selectByPage(dealCount,count);
    }
}

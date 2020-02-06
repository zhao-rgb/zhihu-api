package com.scs.zhihu.api.service;

import com.scs.zhihu.api.domain.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className FavoriteService
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
public interface FavoriteService {
    /**
     * 查询最新收藏
     * @return
     */
    List<Favorite> selectRecentFavorite();

    /**
     * 查询所有收藏
     * @return
     */
    List<Map> selectAllFavorite();
    /**
     * 分页
     * @param currentPage
     * @param count
     * @return
     */
    List<Favorite> selectFavoriteByPage(int currentPage, int count);
}

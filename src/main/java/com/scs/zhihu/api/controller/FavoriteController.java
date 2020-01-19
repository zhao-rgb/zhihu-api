package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className FavoriteController
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;

    @GetMapping
    public Result getRecentFavorite(){
        return  Result.success(favoriteService.selectRecentFavorite());
    }

    @GetMapping(value = "/all")
    public Result getAllRoundTable(){
        return  Result.success(favoriteService.selectAllFavorite());
    }
}

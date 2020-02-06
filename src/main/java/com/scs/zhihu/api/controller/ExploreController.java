package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.domain.vo.ExploreVo;
import com.scs.zhihu.api.service.ExploreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className ExploreController
 * @Description TODO
 * @Date 2020/2/6
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/explore")
public class ExploreController {
    @Resource
    private ExploreService exploreService;

    @GetMapping
    public Result selectRecentExplores(){
        return Result.success(exploreService.selectRecentExplore());
    }
}

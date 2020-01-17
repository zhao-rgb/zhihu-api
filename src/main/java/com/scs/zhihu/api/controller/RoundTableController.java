package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className RoundTableController
 * @Description TODO
 * @Date 2020/1/17
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/roundTable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getRecentRoundTable(){
        return Result.success(roundTableService.selectRecentRoundTable());
    }

    @GetMapping(value = "/all")
    public Result getAllRoundTable(){
        return Result.success(roundTableService.selectAllRoundTable());
    }
}

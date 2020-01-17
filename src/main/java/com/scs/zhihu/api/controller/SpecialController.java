package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className SpecialController
 * @Description TODO
 * @Date 2020/1/15
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @GetMapping
    public Result getRecent() {
        return Result.success(specialService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll() {
        return Result.success(specialService.selectAll());
    }
}

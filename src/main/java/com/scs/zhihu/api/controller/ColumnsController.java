package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className ColumnsController
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    @GetMapping
    public Result getRecentColumns(){
        return Result.success(columnsService.selectRecentColumns());
    }

    @GetMapping(value = "/all")
    public Result getAllColumns(){
        return Result.success(columnsService.selectAllColumns());
    }

    @PostMapping(value = "page")
    public Result getByPage(int currentPage,int count){
        return Result.success(columnsService.selectColumnsByPage(currentPage,count));
    }
}

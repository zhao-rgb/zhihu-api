package com.scs.zhihu.api.service;

import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.domain.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableServiceTest {
    @Resource
    private RoundTableService roundTableService;

    @Test
    void selectByPage() throws Exception{
        List<RoundTable> list = roundTableService.selectByPage(1,9);
        list.forEach(System.out::println);
    }
}
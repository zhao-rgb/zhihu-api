package com.scs.zhihu.api.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
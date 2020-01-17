package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
@Resource
private RoundTableMapper roundTableMapper;
    @Test
    void selectRecentRoundTable() {
        List<RoundTable> roundTables = roundTableMapper.selectRecentRoundTable();
        roundTables.forEach(System.out::println);
    }

    @Test
    void selectAllRoundTable() {
        List<Map> ro = roundTableMapper.selectAllRoundTable();
        ro.forEach(System.out::println);
    }
}
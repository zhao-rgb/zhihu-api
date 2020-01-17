package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.RoundTable;
import com.scs.zhihu.api.mapper.RoundTableMapper;
import com.scs.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className RoundTableServiceImpl
 * @Description TODO
 * @Date 2020/1/17
 * @Version 1.0
 **/
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> selectRecentRoundTable() {
        return roundTableMapper.selectRecentRoundTable();
    }

    @Override
    public List<Map> selectAllRoundTable() {
        return roundTableMapper.selectAllRoundTable();
    }
}

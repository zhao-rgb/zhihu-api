package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.Columns;
import com.scs.zhihu.api.mapper.ColumnsMapper;
import com.scs.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className ColumnsServiceImpl
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;

    @Override
    public List<Columns> selectRecentColumns() {
        return columnsMapper.selectRecentColumns();
    }

    @Override
    public List<Map> selectAllColumns() {
        return columnsMapper.selectAllColumns();
    }
}

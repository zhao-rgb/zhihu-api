package com.scs.zhihu.api.service;

import com.scs.zhihu.api.domain.entity.RoundTable;

import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className RoundTableService
 * @Description TODO
 * @Date 2020/1/17
 * @Version 1.0
 **/
public interface RoundTableService {
    /**
     * 查询最新圆桌
     * @return
     */
    List<RoundTable> selectRecentRoundTable();

    /**
     * 查询所有圆桌
     * @return
     */
    List<Map> selectAllRoundTable();

    /**
     * 分页
     * @param currentPage
     * @param count
     * @return
     */
    List<RoundTable> selectByPage(int currentPage, int count);
}

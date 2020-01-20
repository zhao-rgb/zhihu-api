package com.scs.zhihu.api.service;

import com.scs.zhihu.api.entity.Columns;

import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className ColumnsService
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
public interface ColumnsService {
    /**
     * 查询最新专栏
     * @return
     */
    List<Columns> selectRecentColumns();

    /**
     * 查询所有专栏
     * @return
     */
    List<Map> selectAllColumns();

    /**
     *
     * @param currentPage
     * @param count
     * @return
     */
    List<Columns> selectColumnsByPage(int currentPage, int count);
}

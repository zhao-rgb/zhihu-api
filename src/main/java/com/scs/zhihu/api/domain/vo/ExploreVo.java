package com.scs.zhihu.api.domain.vo;

import com.scs.zhihu.api.domain.entity.Columns;
import com.scs.zhihu.api.domain.entity.Favorite;
import com.scs.zhihu.api.domain.entity.RoundTable;
import com.scs.zhihu.api.domain.entity.Special;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className ExploreVo
 * @Description 发现视图
 * @Date 2020/2/6
 * @Version 1.0
 **/
@Data
@Builder
public class ExploreVo {
    private List<Special> specials;
    private List<RoundTable> roundTables;
    private List<Favorite> favorites;
    private List<Columns> columnsList;
}

package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.domain.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhao
 * @className SectionMapper
 * @Description TODO
 * @Date 2020/1/15
 * @Version 1.0
 **/
public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     * @param specialId
     * @return list<Section>
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionBySpecialId(String specialId);
}

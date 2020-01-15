package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.entity.Section;
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
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionBySpecialId(String specialId);
}

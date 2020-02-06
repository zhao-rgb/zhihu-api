package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.domain.entity.Columns;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zhao
 * @className ColumnsMapper
 * @Description TODO
 * @Date 2020/1/19
 * @Version 1.0
 **/
public interface ColumnsMapper {
    /**
     * 查询最新专栏
     * @return list<Columns>
     */
    @Select("SELECT * FROM t_columns ORDER BY id ASC LIMIT 1,4")
    List<Columns> selectRecentColumns();

    @Select("SELECT * FROM t_columns")
    @Results({
            @Result(property = "id",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class)
    })
    List<Map> selectAllColumns();

    @Select("SELECT id , title , description , url , image_url , followers ,articles_count FROM t_columns ORDER BY id LIMIT #{dealCount} , #{count}")
    List<Columns> selectByPage(int dealCount, int count);
}

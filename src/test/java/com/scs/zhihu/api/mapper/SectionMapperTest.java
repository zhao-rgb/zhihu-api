package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.domain.entity.Section;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SectionMapperTest {


    @Resource
    private SectionMapper sectionMapper;



    @Test
     public void getSectionBySpecialId() {
        List<Section> sections = sectionMapper.getSectionBySpecialId("19591091");
        System.out.println(sections);

    }
}
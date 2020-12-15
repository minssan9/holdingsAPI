package com.halla.holdings.inv.mapper;

import com.halla.holdings.inv.domain.InvSample;
import com.halla.holdings.inv.dto.InvSampleDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public class InvMapper {
    protected static final String NAMESPACE = "com.halla.holdings.*.mapper.";

    @Autowired
    private SqlSession sqlSessionTemplate;

    // HashMap을 이용한 예제

    public List<InvSample> findSampleList(String qDate){
        return sqlSessionTemplate.selectList(NAMESPACE +  "sampleMapper", qDate);
    };

    public Integer insertSample(InvSampleDto invSampleDto){
        return sqlSessionTemplate.insert(NAMESPACE +  "insertSample", invSampleDto);
    };

}

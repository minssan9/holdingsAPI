package halla.holdings.inv.mapper;

import halla.holdings.inv.domain.InvSample;
import halla.holdings.inv.dto.InvSampleDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public class InvMapper {
    protected static final String NAMESPACE = "com.holdings.*.mapper.";

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

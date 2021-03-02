package com.core.oracle.menu.mapper;//package com.service.oracle.menu.mapper;
//
//import com.service.oracle.inv.dto.InvSampleDto;
//import com.service.oracle.menu.domain.FndResponsibility;
//import com.service.oracle.menu.dto.MenuDto;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Mapper
//@Component
//public class MenuMapper {
//    protected static final String NAMESPACE = "com.holdings.oracle.menu.mapper.";
//
//    @Autowired
//    private SqlSession sqlSessionTemplate;
//
//    // HashMap을 이용한 예제
//
//    public List<FndResponsibility> findSampleList(MenuDto menuDto){
//        return sqlSessionTemplate.selectList(NAMESPACE +  "getMenuByPermission", menuDto);
//    };
//
//    public Integer insertSample(InvSampleDto invSampleDto){
//        return sqlSessionTemplate.insert(NAMESPACE +  "insertSample", invSampleDto);
//    };
//
//}

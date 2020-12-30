package halla.holdings.oracle.menu.controller;

import halla.holdings.oracle.menu.domain.UserPermission;
import halla.holdings.oracle.menu.repository.UserPermissionRepository;
import halla.holdings.oracle.menu.repository.UserPermissionRepositorySupport;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
class MenuControllerTest {


    @Autowired UserPermissionRepository userPermissionRepository;
    @Autowired UserPermissionRepositorySupport userPermissionRepositorySupport;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllList() {

        String respName = "재고 재고관리자";
//        log.trace(userPermissionRepositorySupport.findByName("민상훈").toString());
        List<UserPermission> userPermissions = userPermissionRepositorySupport.findByName("민상훈");

        log.trace(userPermissionRepository.findByDescriptionLike("%재고 재고관리자%").toString());
        userPermissions = userPermissionRepository.findByDescriptionLike("%재고 재고관리자%");
        //QueryDsl
        log.trace(userPermissionRepositorySupport.findByPermissionName("재고").toString());
        userPermissions = userPermissionRepositorySupport.findByPermissionName("재고");

        Assert.assertNotNull(
                userPermissionRepository.findByDescriptionLike("재고 재고관리자")
        );
        log.trace(userPermissionRepository.findByDescriptionLike("재고 재고관리자").toString());
        Assert.assertNotNull(
                userPermissionRepositorySupport.findByName(respName)
        );

    }
    @Test
    void getDataQueryAnnotation() {
//        Assert.assertnotnull(
//                userpermissionrepository.findbyquery("재고 재고관리자")
//        );
    }

}

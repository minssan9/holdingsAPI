package halla.holdings.oracle.menu.controller;

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
        Assert.assertNotNull(
                userPermissionRepository.findByPermissionName("재고 재고관리자")
        );
        log.debug(userPermissionRepository.findByPermissionName("재고 재고관리자").toString());
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

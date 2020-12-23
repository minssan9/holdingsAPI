package halla.holdings.oracle.menu.controller;

import halla.holdings.oracle.menu.repository.UserPermissionRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class MenuControllerTest {

    @Autowired
    UserPermissionRepository userPermissionRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllList() {
        Assert.assertNotNull(
                userPermissionRepository.findByFndResponsibility_Responsibility_name("재고 재고관리자")
        );
    }
}

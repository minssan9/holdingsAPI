package com.inv.service;

import static org.junit.jupiter.api.Assertions.*;

import com.inv.repository.XxeItemsImportTempRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XxeItemImportTempServiceImplTest {

    @Autowired
    XxeItemsImportTempRepo xxeItemsImportTempRepo;
    @Test
    void importItems() {
        xxeItemsImportTempRepo.executeConcurrent("INV", "INCOIN", 87, 7232);
    }
}

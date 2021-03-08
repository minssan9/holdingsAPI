package com.service.controller.inv;


import com.service.file.service.FileStorageService;
import com.inv.repository.XxeItemSpecInfoTmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inv")
public class ExcelConfroller {

    @Autowired
    FileStorageService fileStorageService;

    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;


}

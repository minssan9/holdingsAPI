package com.service.controller.inv;

import com.core.oracle.inv.domain.XxeItemSpecInfoTmp;
import com.core.oracle.inv.repository.XxeItemSpecInfoTmpRepository;
import com.core.oracle.inv.service.ItemSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemSpecService itemSpecService;
    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;

    @GetMapping
    public ResponseEntity getItemList() throws IOException {
        return ResponseEntity.ok(xxeItemSpecInfoTmpRepository.findAll());
    }

    @PostMapping(value = "/excel")
    public ResponseEntity importItemExcelFile(@RequestParam("file") MultipartFile files) throws Exception {

        List<XxeItemSpecInfoTmp> itemSpecs = itemSpecService.uploadItemsFromExcel(files);

        return new ResponseEntity(itemSpecs, HttpStatus.OK);
    }

}

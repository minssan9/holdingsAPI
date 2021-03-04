package com.service.controller.inv;

import com.core.oracle.inv.domain.XxeItemSpecInfoTmp;
import com.core.oracle.inv.repository.XxeItemSpecInfoTmpRepository;
import com.service.service.ItemSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController("/item")
public class ItemController {
    @Autowired
    ItemSpecService itemSpecService;
    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
    @GetMapping
    public ResponseEntity getItemList(Pageable pageable) throws IOException {
        return ResponseEntity.ok(xxeItemSpecInfoTmpRepository.findAll(pageable));
    }

    @PostMapping(value = "/excel")
    public ResponseEntity importItemExcelFile(@RequestParam("file") MultipartFile files) throws Exception {

        List<XxeItemSpecInfoTmp> itemSpecs = itemSpecService.uploadItemsFromExcel(files);

        return new ResponseEntity(itemSpecs, HttpStatus.OK);
    }

}

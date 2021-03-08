package com.service.controller.inv;

import com.inv.domain.XxeItemsImportTemp;
import com.inv.repository.XxeItemSpecInfoTmpRepository;
import com.inv.repository.XxeItemsImportTempRepo;
import com.inv.service.ItemSpecService;
import com.inv.service.XxeItemImportTempService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/item/upload")
public class ItemUploadController {

    @Autowired
    ItemSpecService itemSpecService;

    @Autowired
    XxeItemImportTempService xxeItemImportTempService;
    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;

    @Autowired
    XxeItemsImportTempRepo xxeItemsImportTempRepo;

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException {

        public ResourceNotFoundException(String message) {
            super(message);
        }
    }

    @GetMapping
    public ResponseEntity getUploadItemList(Pageable pageable) throws IOException {
        return ResponseEntity.ok(xxeItemsImportTempRepo.findAll(pageable));
    }

    @RequestMapping(value = "/files")
    @PostMapping
    public ResponseEntity importExcelFile(@RequestParam MultipartFile file) throws IOException {
        XSSFSheet worksheet = new XSSFWorkbook(file.getInputStream()).getSheetAt(0);
        List<XxeItemsImportTemp> xxeItemsImportTemps = xxeItemImportTempService.importItems(worksheet);
        return new ResponseEntity(xxeItemsImportTemps, HttpStatus.OK);
    }



}

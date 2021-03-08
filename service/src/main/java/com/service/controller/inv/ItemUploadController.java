package com.service.controller.inv;

import com.inv.domain.XxeItemsImportTemp;
import com.inv.repository.XxeItemSpecInfoTmpRepository;
import com.inv.repository.XxeItemsImportTempRepo;
import com.inv.service.ItemSpecService;
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

        List<XxeItemsImportTemp> xxeItemsImportTemps = new ArrayList<>();
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);                // 생성자로 만들기
                XxeItemsImportTemp xxeItemsImportTemp = new XxeItemsImportTemp();
                xxeItemsImportTemp.setSegment1(
                    row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setDescription(
                    row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setPrimaryUomCode(
                    row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setTemplateName(
                    row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setEngItemFlag(
                    row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setWeightUomCode(
                    row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setUnitWeight(
                    row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getNumericCellValue());
                xxeItemsImportTemp.setVolumeUomCode(
                    row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getStringCellValue());
                xxeItemsImportTemp.setUnitVolume(
                    row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                        .getNumericCellValue());
//                    .(row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(15, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(16, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(17, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(18, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                xxeItemsImportTemp.setCreationDate(LocalDateTime.now());
                xxeItemsImportTemp.setLastUpdateDate(LocalDateTime.now());

                xxeItemsImportTemps.add(xxeItemsImportTemp);
            }
        }
        xxeItemsImportTempRepo.saveAll(xxeItemsImportTemps);

        return new ResponseEntity(xxeItemsImportTemps, HttpStatus.OK);
    }


}

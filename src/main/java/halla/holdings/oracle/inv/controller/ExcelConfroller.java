package halla.holdings.oracle.inv.controller;


import halla.holdings.oracle.file.service.FileStorageService;
import halla.holdings.oracle.inv.domain.InvSample;
import halla.holdings.oracle.item.repository.ItemSpecRepository;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/inv/excel")
public class ExcelConfroller {
    @Autowired
    FileStorageService fileStorageService;

    @Autowired
    ItemSpecRepository itemSpecRepository;
    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public ResponseEntity importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {
        List<InvSample> invSamples = new ArrayList<>();

        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);

        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);
                // 생성자로 만들기
                InvSample invSample = new InvSample(
                        row.getCell(1, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(2, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(3, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(4, row.CREATE_NULL_AS_BLANK).getStringCellValue()
                );

                // Setter  로 만들기
//                Integer id = row.getCell(0).getStringCellValue();
//                invSample.setId(id.toString());
                invSample.setItemNumber(row.getCell(1).getStringCellValue());
//                invSample.set(row.getCell(2).getNumericCellValue());
                invSample.setStatus(row.getCell(3).getStringCellValue());

                invSamples.add(invSample);
            }
        }

        return new ResponseEntity(invSamples, HttpStatus.OK);
    }


}

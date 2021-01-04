package halla.holdings.oracle.inv.controller;


import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import halla.holdings.oracle.file.service.FileStorageService;
import halla.holdings.oracle.inv.domain.InvSample;
import halla.holdings.oracle.inv.domain.ItemSpec;
import halla.holdings.oracle.inv.repository.ItemSpecRepository;
import org.apache.poi.ss.usermodel.Row;
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
                        row.getCell(1).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),
                        row.getCell(1).getStringCellValue()
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


    @RequestMapping(value = "/item/import", method = RequestMethod.POST)
    public ResponseEntity importItemExcelFile(@RequestParam("file") MultipartFile files) throws IOException {



        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);
        List<ItemSpec> itemSpecs = new ArrayList<>();
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);

                // 생성자로 만들기
                ItemSpec itemSpec = new ItemSpec(
                        row.getCell(1, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(2, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(3, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(4, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(5, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(6, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(7, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(8, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(9, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(10, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(11, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(12, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(13, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(14, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(15, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(16, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(17, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(18, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(19, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(20, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(21, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(22, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
                        row.getCell(23, row.CREATE_NULL_AS_BLANK).getStringCellValue()
                );

                // Setter  로 만들기
//                Integer id = row.getCell(0).getStringCellValue();
//                invSample.setId(id.toString());
//                itemSpec.setItemNumber(row.getCell(1).getStringCellValue());
//                invSample.set(row.getCell(2).getNumericCellValue());
//                itemSpec.setStatus(row.getCell(3).getStringCellValue());

                itemSpecs.add(itemSpec);
                itemSpecRepository.save(itemSpec);
            }
        }
        ;

        return new ResponseEntity(itemSpecs, HttpStatus.OK);
    }
}

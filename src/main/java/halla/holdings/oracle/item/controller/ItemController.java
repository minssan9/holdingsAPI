package halla.holdings.oracle.item.controller;

import halla.holdings.oracle.item.repository.ItemSpecRepository;
import halla.holdings.oracle.item.domain.ItemSpec;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemSpecRepository itemSpecRepository;

    @GetMapping
    public ResponseEntity getItemList() throws IOException {
        return ResponseEntity.ok(itemSpecRepository.findAll());
    }

    @PostMapping(value = "/import")
    public ResponseEntity importItemExcelFile(@RequestParam("file") MultipartFile files) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);
        List<ItemSpec> itemSpecs = new ArrayList<>();
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);

                ItemSpec itemSpec = new ItemSpec();
                // Setter  로 만들기
                itemSpec.setItem_number(row.getCell(1, row.CREATE_NULL_AS_BLANK).getStringCellValue());
//                itemSpec.set(row.getCell(8).getNumericCellValue());
                itemSpec.setIfflag(row.getCell(8, row.CREATE_NULL_AS_BLANK).getStringCellValue());
                itemSpec.setCreation_date(row.getCell(9,row.CREATE_NULL_AS_BLANK).getStringCellValue());
                itemSpec.setLast_update_date(row.getCell(11, row.CREATE_NULL_AS_BLANK).getStringCellValue());

                // 생성자로 만들기
//                (
//                        row.getCell(1, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(2, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(3, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(4, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(5, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(6, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(7, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(8, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(9, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(10, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(11, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(12, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(13, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(14, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(15, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(16, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(17, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(18, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(19, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(20, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(21, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(22, row.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(23, row.CREATE_NULL_AS_BLANK).getStringCellValue()
//                );

                itemSpecs.add(itemSpec);
                itemSpecRepository.save(itemSpec);
            }
        }
        ;

        return new ResponseEntity(itemSpecs, HttpStatus.OK);
    }
}

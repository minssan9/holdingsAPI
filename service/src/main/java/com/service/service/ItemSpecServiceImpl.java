package com.service.service;

import static com.core.config.StaticConfig.DATE_STRING_FORMAT;

import com.core.oracle.inv.domain.XxeItemSpecInfoTmp;
import com.core.oracle.inv.repository.XxeItemSpecInfoTmpRepository;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ItemSpecServiceImpl implements ItemSpecService {
    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;

    public List<XxeItemSpecInfoTmp> uploadItemsFromExcel(MultipartFile files) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);
        List<XxeItemSpecInfoTmp> itemSpecs = new ArrayList<>();
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);

                XxeItemSpecInfoTmp itemSpec = new XxeItemSpecInfoTmp();
                // Setter  로 만들기
                itemSpec.setItemNumber(row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
//                itemSpec.set(row.getCell(8).getNumericCellValue());
                itemSpec.setIfflag(row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                itemSpec.setCreationDate(LocalDateTime
                    .parse(row.getCell(9,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), DATE_STRING_FORMAT));
                itemSpec.setLastUpdateDate(LocalDateTime.parse(row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), DATE_STRING_FORMAT));

                // 생성자로 만들기
//                (
//                        row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(15, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(16, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(17, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(18, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(19, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(20, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(21, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(22, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(),
//                        row.getCell(23, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue()
//                );

                itemSpecs.add(itemSpec);
                xxeItemSpecInfoTmpRepository.save(itemSpec);
            }
        }
        return itemSpecs;
    }

}

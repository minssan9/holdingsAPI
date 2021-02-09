package com.core.oracle.inv.service;

import com.core.oracle.inv.domain.XxeItemSpecInfoTmp;
import com.core.oracle.inv.repository.XxeItemSpecInfoTmpRepository;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.core.HoldingsApiApplication.dateFormatString;

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
                itemSpec.setItemNumber(row.getCell(1, row.CREATE_NULL_AS_BLANK).getStringCellValue());
//                itemSpec.set(row.getCell(8).getNumericCellValue());
                itemSpec.setIfflag(row.getCell(8, row.CREATE_NULL_AS_BLANK).getStringCellValue());
                itemSpec.setCreationDate(LocalDateTime.parse(row.getCell(9, row.CREATE_NULL_AS_BLANK).getStringCellValue(), dateFormatString));
                itemSpec.setLastUpdateDate(LocalDateTime.parse(row.getCell(11, row.CREATE_NULL_AS_BLANK).getStringCellValue(), dateFormatString));

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
                xxeItemSpecInfoTmpRepository.save(itemSpec);
            }
        }
        return itemSpecs;
    }
}

package com.service.controller.inv;


import static com.core.config.StaticConfig.DATE_STRING_FORMAT;

import com.service.file.service.FileStorageService;
import com.core.oracle.inv.domain.XxeErpOtherTrxs;
import com.core.oracle.inv.repository.XxeErpOtherTrxsRepository;
//import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//@Tag(name = "Multiple data source example", description = "This controller is for the test")
@RestController("/inv/trx")
public class TransactionConfroller {
    @Autowired
    FileStorageService fileStorageService;

    @Autowired
    XxeErpOtherTrxsRepository xxeErpOtherTrxsRepository;

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }

    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public ResponseEntity importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {
        List<XxeErpOtherTrxs> xxeErpOtherTrxs = new ArrayList<>();

        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);

        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);
                // 생성자로 만들기
                XxeErpOtherTrxs xxeErpOtherTrx = new XxeErpOtherTrxs();

                // Setter  로 만들기
                xxeErpOtherTrx.setSeq((long) row.getCell(1).getNumericCellValue());
                xxeErpOtherTrx.setOrganizationId((long) row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setGroupId(row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setLineNum((long) row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setSubinventoryCode(row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setTransactionTypeId((long) row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setTransactionActionId((long) row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setTransactionDate(LocalDateTime.parse(row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), DATE_STRING_FORMAT));
                xxeErpOtherTrx.setCodeCombinationId((long) row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setDeptCode(row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setItemCode(row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setTransactionQuantity((long) row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue());

                xxeErpOtherTrxs.add(xxeErpOtherTrx);
            }
            xxeErpOtherTrxsRepository.saveAll(xxeErpOtherTrxs);
        }

        return new ResponseEntity(xxeErpOtherTrxs, HttpStatus.OK);
    }


}

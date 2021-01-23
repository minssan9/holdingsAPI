package halla.holdings.oracle.inv.controller;


import halla.holdings.oracle.file.service.FileStorageService;
import halla.holdings.oracle.inv.domain.XxeErpOtherTrxs;
import halla.holdings.oracle.inv.repository.XxeErpOtherTrxsRepository;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static halla.holdings.HoldingsApiApplication.dateFormatString;

@RestController
@RequestMapping("/inv/trx")
public class TransactionConfroller {
    @Autowired
    FileStorageService fileStorageService;

    @Autowired
    XxeErpOtherTrxsRepository xxeErpOtherTrxsRepository;

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
                xxeErpOtherTrx.setSeq((long) row.getCell(1, row.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setOrganizationId((long) row.getCell(2, row.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setGroupId(row.getCell(3, row.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setLineNum((long) row.getCell(4, row.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setSubinventoryCode(row.getCell(5, row.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setTransactionTypeId((long) row.getCell(6, row.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setTransactionActionId((long) row.getCell(7, row.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setTransactionDate(LocalDateTime.parse(row.getCell(8,row.CREATE_NULL_AS_BLANK).getStringCellValue(), dateFormatString));
                xxeErpOtherTrx.setCodeCombinationId((long) row.getCell(9, row.CREATE_NULL_AS_BLANK).getNumericCellValue());
                xxeErpOtherTrx.setDeptCode(row.getCell(10, row.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setItemCode(row.getCell(11, row.CREATE_NULL_AS_BLANK).getStringCellValue());
                xxeErpOtherTrx.setTransactionQuantity((long) row.getCell(12, row.CREATE_NULL_AS_BLANK).getNumericCellValue());

                xxeErpOtherTrxs.add(xxeErpOtherTrx);
            }
            xxeErpOtherTrxsRepository.saveAll(xxeErpOtherTrxs);
        }

        return new ResponseEntity(xxeErpOtherTrxs, HttpStatus.OK);
    }


}

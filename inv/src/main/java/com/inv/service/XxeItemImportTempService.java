package com.inv.service;

import com.inv.domain.XxeItemsImportTemp;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.stereotype.Service;

@Service
public interface XxeItemImportTempService {
    List<XxeItemsImportTemp> importItems(XSSFSheet worksheet) ;
}

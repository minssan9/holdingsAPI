package com.inv.service;

import com.inv.domain.MtlSystemItemsInterface;
import com.sun.media.sound.InvalidDataException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.stereotype.Service;

@Service
public interface XxeItemImportTempService {
    List<MtlSystemItemsInterface> importItems(XSSFSheet worksheet) throws InvalidDataException, Exception;
}

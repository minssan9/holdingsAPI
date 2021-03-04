package com.service.service;

import com.core.oracle.inv.domain.XxeItemSpecInfoTmp;
import com.core.oracle.inv.repository.XxeItemSpecInfoTmpRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface ItemSpecService {
    List<XxeItemSpecInfoTmp> uploadItemsFromExcel(MultipartFile files) throws Exception;
}

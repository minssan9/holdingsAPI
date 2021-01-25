package halla.holdings.oracle.inv.service;

import halla.holdings.oracle.inv.domain.XxeItemSpecInfoTmp;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface ItemSpecService {
    public List<XxeItemSpecInfoTmp> uploadItemsFromExcel(MultipartFile files) throws IOException;

}

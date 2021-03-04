package com.core.oracle.item.service;

import com.core.oracle.inv.repository.XxeItemSpecInfoTmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemSpecServiceImpl implements ItemSpecService {
    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;

}

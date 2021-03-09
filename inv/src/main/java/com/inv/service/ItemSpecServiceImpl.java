package com.inv.service;

import com.inv.repository.XxeItemSpecInfoTmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemSpecServiceImpl implements ItemSpecService {

    @Autowired
    XxeItemSpecInfoTmpRepository xxeItemSpecInfoTmpRepository;

}

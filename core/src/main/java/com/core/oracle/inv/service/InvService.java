package com.core.oracle.inv.service;

import com.core.oracle.inv.domain.InvSample;
import com.core.oracle.inv.dto.InvSampleDto;
import org.springframework.stereotype.Service;

@Service
public class InvService {
//    @Autowired
//    private InvMapper invMapper;

    public InvSample getInvSample (InvSampleDto invSampleDto)   {
        return new InvSample();
    }
}
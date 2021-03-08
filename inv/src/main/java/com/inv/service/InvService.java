package com.inv.service;


import com.inv.domain.InvSample;
import com.inv.dto.InvSampleDto;
import org.springframework.stereotype.Service;

@Service
public class InvService {

    public InvSample getInvSample(InvSampleDto invSampleDto) {
        return new InvSample();
    }
}

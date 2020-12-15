package com.halla.holdings.inv.service;

import com.halla.holdings.inv.domain.InvSample;
import com.halla.holdings.inv.dto.InvSampleDto;
import com.halla.holdings.inv.mapper.InvMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvService {
    @Autowired
    private InvMapper invMapper;

    public InvSample getInvSample (InvSampleDto invSampleDto)   {
        return new InvSample();
    }
}

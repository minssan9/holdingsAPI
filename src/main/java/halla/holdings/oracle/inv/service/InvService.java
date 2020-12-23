package halla.holdings.oracle.inv.service;

import halla.holdings.oracle.inv.domain.InvSample;
import halla.holdings.oracle.inv.dto.InvSampleDto;
import halla.holdings.oracle.inv.mapper.InvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvService {
    @Autowired
    private InvMapper invMapper;

    public InvSample getInvSample (InvSampleDto invSampleDto)   {
        return new InvSample();
    }
}

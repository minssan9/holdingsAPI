package com.inv.service;

import com.inv.domain.MtlSystemItemsInterface;
import com.inv.repository.MtlSystemItemsBRepository;
import com.inv.repository.MtlSystemItemsInterfaceRepository;
import com.inv.repository.XxeItemsImportTempRepo;
import com.sun.media.sound.InvalidDataException;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XxeItemImportTempServiceImpl implements XxeItemImportTempService {

    @Autowired
    MtlSystemItemsBRepository mtlSystemItemsBRepository;
    @Autowired
    MtlSystemItemsInterfaceRepository mtlSystemItemsInterfaceRepository;
    @Autowired
    XxeItemsImportTempRepo xxeItemsImportTempRepo;

    @Transactional
    public List<MtlSystemItemsInterface> importItems(XSSFSheet worksheet) throws Exception {
//        List<XxeItemsImportTemp> xxeItemsImportTemps = new ArrayList<>();
//        for (int index = 1; index < worksheet.getPhysicalNumberOfRows(); index++) {
//            xxeItemsImportTemps.add(new XxeItemsImportTemp(worksheet.getRow(index)));
//        }
//        xxeItemsImportTempRepo.saveAll(xxeItemsImportTemps);

        List<MtlSystemItemsInterface> mtlSystemItemsInterfaces = new ArrayList<>();
        for (int index = 1; index < worksheet.getPhysicalNumberOfRows(); index++) {
            MtlSystemItemsInterface mtlSystemItemsInterface =  new MtlSystemItemsInterface(worksheet.getRow(index));

            mtlSystemItemsBRepository.findByOrganizationIdAndSegment1(mtlSystemItemsInterface.getOrganizationId(), mtlSystemItemsInterface.getSegment1());
            if(!mtlSystemItemsInterface.getEngItemFlag().equals("Y") && !mtlSystemItemsInterface.getEngItemFlag().equals("N"))
                throw new InvalidDataException();

            mtlSystemItemsInterfaces.add(mtlSystemItemsInterface );
        }
        mtlSystemItemsInterfaceRepository.saveAll(mtlSystemItemsInterfaces);

//        -- VALIDATION.OP_CODE 유효입력 확인
//        -- 1. CREATE -> 이미 존재 / 2. UPDATE -> 미 존재 유형 확인
//        SELECT COUNT(1)
//        INTO V_CNT_ITEM
//        FROM MTL_SYSTEM_ITEMS_B
//        WHERE ORGANIZATION_ID = C_REC.ORGANIZATION_ID
//        AND SEGMENT1        = C_REC.SEGMENT1;
//
//        IF C_REC.TRANSACTION_TYPE IN('CREATE','UPDATE') THEN
//        IF (V_CNT_ITEM >0 AND C_REC.TRANSACTION_TYPE ='CREATE') THEN
//        UPDATE XXE_ITEMS_IMPORT_TEMP
//        SET TRANSACTION_TYPE = 'UPDATE'
//        WHERE SEQ = C_REC.SEQ;
//
//        CONTROL.Quiet_Commit;
//        ELSIF (V_CNT_ITEM =0 AND C_REC.TRANSACTION_TYPE = 'UPDATE') THEN
//        UPDATE XXE_ITEMS_IMPORT_TEMP
//        SET TRANSACTION_TYPE = 'CREATE'
//        WHERE SEQ = C_REC.SEQ;
//
//        CONTROL.Quiet_Commit;
//        END IF;
//        ELSE
//        V_VALID_FLAG :='E';
//        V_VALID_MSG  :='유효하지 않은 작업코드.' ;
//        END IF;
//
//        -- VALIDATION. ITEM_TEMPLATE
//        BEGIN
//        SELECT TEMPLATE_NAME
//        INTO   V_TPL_NAME
//        FROM MTL_ITEM_TEMPLATES
//        WHERE TEMPLATE_NAME = UPPER(C_REC.TEMPLATE_NAME);
//        EXCEPTION WHEN NO_DATA_FOUND THEN
//        V_VALID_FLAG :='E';
//        V_VALID_MSG  := V_VALID_MSG||' 유효하지 않은 템플릿유형.';
//        END;
//
//        -- VALIDATION. ENG_ITEM_FLAG
//        IF  C_REC.ENG_ITEM_FLAG NOT IN ('Y','N') THEN
//        V_VALID_FLAG :='E';
//        V_VALID_MSG  := V_VALID_MSG||' 유효하지 않은 설계품목여부.';
//        END IF;
//
//        -- VALIDATION. PRIMARY UOM
//            BEGIN
//        SELECT UNIT_OF_MEASURE
//        INTO   V_UOM
//        FROM MTL_UNITS_OF_MEASURE
//        WHERE UOM_CODE = UPPER(C_REC.PRIMARY_UOM_CODE);
//        EXCEPTION WHEN NO_DATA_FOUND THEN
//        V_VALID_FLAG :='E';
//        V_VALID_MSG  := V_VALID_MSG||' 유효하지 않은 UOM.';
//        END;
//
//        IF (C_REC.ORGANIZATION_ID= 83 AND C_REC.DESCRIPTION IS NULL) THEN
//        V_VALID_FLAG :='E';
//        V_VALID_MSG  := V_VALID_MSG||' 유효하지 않은 품목명.';
//        END IF;
//
//        -- VALIDATION. ORG_ID
//        SELECT COUNT(1)
//        INTO   V_ORG_CNT
//        FROM   ORG_ORGANIZATION_DEFINITIONS
//        WHERE  ORGANIZATION_ID = C_REC.ORGANIZATION_ID;
//
//        IF v_org_cnt = 0 THEN
//        V_VALID_FLAG :='E';
//        V_VALID_MSG  := V_VALID_MSG||' 유효하지 않은 조직.';
//        END IF;
        xxeItemsImportTempRepo.executeConcurrent("INV", "INCOIN", 87, 7232);
        return mtlSystemItemsInterfaces;
    }


}

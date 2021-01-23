package halla.holdings.oracle.inv.repository;

import halla.holdings.oracle.inv.domain.MtlSystemItemsB;
import halla.holdings.oracle.inv.domain.MtlUnitTransactions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class MtlUnitTransactionsRepositoryTest {

    @Autowired
    MtlSystemItemsBRepository mtlSystemItemsBRepository;

    @Test
    void getTest(){
        List<MtlSystemItemsB> mtlSystemItemsBS= mtlSystemItemsBRepository.findBySegment1 ("AL000021C");
        MtlSystemItemsB mtlSystemItemsB= mtlSystemItemsBRepository.findBySegment1AndOrganizationId ("AL000021C", 87);
        System.out.println(mtlSystemItemsBS.toString());

        Assert.assertNotNull(mtlSystemItemsB);
        Assert.assertNotNull(mtlSystemItemsBS);
    }
}

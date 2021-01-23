package halla.holdings.oracle.inv.controller;

import halla.holdings.oracle.inv.domain.MtlUnitTransactions;
import halla.holdings.oracle.inv.repository.MtlUnitTransactionsRepository;
import halla.holdings.oracle.inv.service.InvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inv/mtl")
class MtlController {
    @Autowired
    MtlUnitTransactionsRepository mtlUnitTransactionsRepository;


//    @GetMapping("/params")
//    public ResponseEntity getAllList(@PathVariable String qDate) throws Exception {
//        return new ResponseEntity(invMapper.findSampleList(qDate), HttpStatus.OK);
//    }

    @GetMapping("{id}")
    public ResponseEntity getOneItDamage(@PathVariable long id) throws Exception {
        return new ResponseEntity(mtlUnitTransactionsRepository.findById(id), HttpStatus.OK);
    }
//    @PutMapping
//    public ResponseEntity updateItDamage(@RequestBody ItDamage itDamage ) throws Exception {
//        return new ResponseEntity(itDamageService.update(itDamage), HttpStatus.OK);
//    }

//    @PostMapping
//    public ResponseEntity createItDamage(@RequestBody InvSampleDto invSampleDto)  throws Exception {
////		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+itDamageCreated.getRtime()	).buildAndExpand(itDamageCreated.getRtime()).toUri();
//        return new ResponseEntity(invMapper.insertSample(invSampleDto), HttpStatus.OK);
//    }

}

package com.core.oracle.inv.controller;

import com.core.oracle.inv.service.InvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inv")
class InvController {
//    @Autowired
//    private InvMapper invMapper;

    @Autowired
    private InvService invService;

//    @GetMapping("/params")
//    public ResponseEntity getAllList(@PathVariable String qDate) throws Exception {
//        return new ResponseEntity(invMapper.findSampleList(qDate), HttpStatus.OK);
//    }

//    @GetMapping("{rtime}")
//    public  ResponseEntity getOneItDamage(@PathVariable String rtime) throws Exception {
//        return new ResponseEntity(invMapper.findItDamageByRtime("SEOHAN", rtime), HttpStatus.OK);
//    }
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

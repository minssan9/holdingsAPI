package halla.holdings.oracle.menu.controller;

import halla.holdings.oracle.menu.repository.FndResponsibilityRepository;
import halla.holdings.oracle.menu.repository.UserPermissionRepositorySupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
@Slf4j
public class MenuController {
    @Autowired
    private UserPermissionRepositorySupport userPermissionRepositorySupport;

//    @Autowired
//    FndResponsibilityRepository fndResponsibilityRepository;


    @GetMapping("/resp/{respName}")
    public ResponseEntity getAllList(@PathVariable String respName) {
//        log.debug(fndResponsibilityRepository.findByRow_id(respName).toString());
//        return new ResponseEntity( fndResponsibilityRepository.findByRow_id(respName), HttpStatus.OK);
        log.debug(userPermissionRepositorySupport.findByName(respName).toString());
        return new ResponseEntity(userPermissionRepositorySupport.findByName(respName), HttpStatus.OK);
//        return new ResponseEntity(userPermissionRepository.findByFndResponsibility_Responsibility_name(respName), HttpStatus.OK);
    }
}

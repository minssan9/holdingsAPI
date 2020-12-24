package halla.holdings.oracle.menu.controller;

import halla.holdings.oracle.menu.repository.UserPermissionRepositorySupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private UserPermissionRepositorySupport userPermissionRepositorySupport;


    @GetMapping("/resp/{respName}")
    public ResponseEntity getAllList(@PathVariable String respName) {
        return new ResponseEntity(userPermissionRepositorySupport.findByName(respName), HttpStatus.OK);
//        return new ResponseEntity(userPermissionRepository.findByFndResponsibility_Responsibility_name(respName), HttpStatus.OK);
    }
}

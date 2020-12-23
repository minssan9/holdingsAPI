package halla.holdings.oracle.menu.controller;

import halla.holdings.oracle.menu.repository.UserPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("menu")
public class MenuController {
    @Autowired
    private UserPermissionRepository userPermissionRepository;


    @GetMapping("/resp/{respName}")
    public ResponseEntity getAllList(@PathVariable String respName) throws Exception {
        return new ResponseEntity(userPermissionRepository.findByFndResponsibility_Responsibility_name(respName), HttpStatus.OK);
    }
}

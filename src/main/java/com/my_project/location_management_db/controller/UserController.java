package com.my_project.location_management_db.controller;

import com.my_project.location_management_db.excaption.BusinessException;
import com.my_project.location_management_db.modal.UserModal;
import com.my_project.location_management_db.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final Logger logger=LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserService userService;

    @PostMapping("/users")


    public ResponseEntity<Boolean> login(@RequestBody UserModal userModal) throws BusinessException {

        logger.debug("Entering method login");
        //ResponseEntity<Boolean> responseEntity=null;
        boolean result = userService.login(userModal);
        ResponseEntity<Boolean> responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
        logger.debug("Exiting method login");
        return responseEntity;
    }

    @PostMapping("/users/register")
    public ResponseEntity<Long> register(@RequestBody UserModal userModal) throws BusinessException {
        //ResponseEntity<Long> responseEntity=null;

        Long result = userService.register(userModal);
        ResponseEntity<Long> responseEntity = new ResponseEntity<>(result, HttpStatus.CREATED);
        return responseEntity;
    }
}
 /* try {
            boolean result=userService.login(userModal);

                responseEntity=new ResponseEntity<>(result,HttpStatus.OK);

            userService.login(userModal);
        } catch (BusinessException be) {

        }*/
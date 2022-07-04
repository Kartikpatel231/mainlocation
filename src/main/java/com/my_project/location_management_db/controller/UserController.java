package com.my_project.location_management_db.controller;

import com.my_project.location_management_db.modal.UserModal;
import com.my_project.location_management_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/v1")
public class UserController {
  //  @Autowired
    private UserService userService;

    //@GetMapping("/users")
    public void login(UserModal userModal){
        userService.login(userModal);
    }
}

package com.my_project.location_management_db.controller;

import com.my_project.location_management_db.model.UserModel;
import com.my_project.location_management_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add-new")
    public void login(UserModel userModel) {
        userService.login(userModel);
    }

    @GetMapping("/get/{userId}")
    public UserModel getUser(@PathVariable Long userId) {
        return userService.findUser(userId);
    }

    @GetMapping("/all")
    public List<UserModel> getAllUsers() {
        UserModel user1 = new UserModel().setUserName("Test 1").setEmail("test1@gmail.com");
        UserModel user2 = new UserModel().setUserName("Test 2").setEmail("test2@gmail.com");

        return Arrays.asList(user1, user2);
    }
}

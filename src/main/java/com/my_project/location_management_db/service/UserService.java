package com.my_project.location_management_db.service;

import com.my_project.location_management_db.model.UserModel;

public interface UserService {

    void login(UserModel userModel);

    UserModel findUser(Long userId);
}

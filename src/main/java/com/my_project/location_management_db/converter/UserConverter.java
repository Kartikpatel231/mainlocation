package com.my_project.location_management_db.converter;

import com.my_project.location_management_db.entity.UserEntity;
import com.my_project.location_management_db.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertModelToEntity(UserModel userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userModel.getEmail());
        userEntity.setUserName(userModel.getUserName());
        userEntity.setMobileNo(userEntity.getMobileNo());
        userEntity.setAddress(userEntity.getAddress());
        userEntity.setUserPassword(userEntity.getUserPassword());

        return userEntity;
    }
}
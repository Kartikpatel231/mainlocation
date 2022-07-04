package com.my_project.location_management_db.converter;

import com.my_project.location_management_db.entity.UserEntity;
import com.my_project.location_management_db.modal.UserModal;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity convertModelToEntity(UserModal userModal)
    {
   UserEntity userEntity=new UserEntity();
        userEntity.setEmail(userModal.getEmail());
        userEntity.setUserName(userModal.getUserName());
        userEntity.setMobileNo(userEntity.getMobileNo());
        userEntity.setAddress(userEntity.getAddress());
        userEntity.setUserPassword(userEntity.getUserPassword());

        return userEntity;
}
}
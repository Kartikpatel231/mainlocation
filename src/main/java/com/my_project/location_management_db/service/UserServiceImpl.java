package com.my_project.location_management_db.service;

import com.my_project.location_management_db.entity.UserEntity;
import com.my_project.location_management_db.repository.UserRepository;
import com.my_project.location_management_db.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository entityRepository;

    @Override
    public void login(UserModel userModel) {
        UserEntity userEntity = entityRepository.findByEmailAndUserPassword(userModel.getEmail(), userModel.getUserPassword());
        System.out.println("Id: " + userEntity.getId());
    }

    @Override
    public UserModel findUser(Long userId) {
        return null;
    }
}

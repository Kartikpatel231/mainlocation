package com.my_project.location_management_db.service;

import com.my_project.location_management_db.entity.UserEntity;
import com.my_project.location_management_db.userEntityRepository.UserRepository;
import com.my_project.location_management_db.modal.UserModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceimplement implements UserService {
    @Autowired
    private UserRepository entityRepository;
    @Override
    public void login(UserModal userModal) {
     UserEntity userEntity= entityRepository.findByEmailAndPassword(userModal.getEmail(),userModal.getUserPassword());
    }
}

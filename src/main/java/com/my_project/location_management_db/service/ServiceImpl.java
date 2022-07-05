package com.my_project.location_management_db.service;

import com.my_project.location_management_db.constant.ErrorType;
import com.my_project.location_management_db.converter.UserConverter;
import com.my_project.location_management_db.entity.UserEntity;
import com.my_project.location_management_db.excaption.BusinessException;
import com.my_project.location_management_db.excaption.ErrorModal;
import com.my_project.location_management_db.userEntityRepository.UserRepository;
import com.my_project.location_management_db.modal.UserModal;
import com.my_project.location_management_db.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    private UserRepository entityRepository;
<<<<<<< HEAD:src/main/java/com/my_project/location_management_db/service/Serviceimpl.java
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private UserValidator userValidator;

    @Override
    public boolean login(UserModal userModal) throws BusinessException {
        //list check of email and password
        List<ErrorModal> errorModelList=userValidator.validateRequest(userModal);
        if(!CollectionUtils.isEmpty(errorModelList)){
            throw new BusinessException(errorModelList);
        }
        boolean result = false;
        UserEntity userEntity = entityRepository.findByEmailAndPassword(userModal.getEmail(), userModal.getPassword());

        if (userEntity == null) {

            List<ErrorModal> errorList = new ArrayList<>();

            ErrorModal errorModal = new ErrorModal();
            errorModal.setCode(ErrorType.AUTH_INVALID_CREDENTIALS.toString());
            errorModal.setMessage("Incorrect email or password");

=======

    @Override
    public boolean login(UserModal userModal) throws BusinessException {
        boolean result;
        UserEntity userEntity = entityRepository.findByEmailAndPassword(userModal.getEmail(), userModal.getPassword());
        if (userEntity == null) {

            List<ErrorModal> errorList = new ArrayList<>();

            ErrorModal errorModal = new ErrorModal();
            errorModal.setCode(ErrorType.AUTH_INVALID_CREDENTIALS.toString());
            errorModal.setMessage("Incorrect email or password");

>>>>>>> 9f94eddf5b3efc1521be2354b6eded1d26572fc6:src/main/java/com/my_project/location_management_db/service/ServiceImpl.java
            errorList.add(errorModal);
            throw new BusinessException(errorList);
        } else {
            result = true;
        }
        return result;
<<<<<<< HEAD:src/main/java/com/my_project/location_management_db/service/Serviceimpl.java
    }

    public Long register(UserModal userModal) throws BusinessException {

        //list check of email and password
        List<ErrorModal> errorModelList = userValidator.validateRequest(userModal);

        if (!CollectionUtils.isEmpty(errorModelList)) {
            throw new BusinessException(errorModelList);
        }
        UserEntity userEntity = userConverter.convertModelToEntity(userModal);
        //check if user already exist
        UserEntity ue=entityRepository.findByEmail(userModal.getEmail());
        if(null!=ue){
            List<ErrorModal> errorList = new ArrayList<>();

            ErrorModal errorModal = new ErrorModal();
            errorModal.setCode(ErrorType.ALREADY_EXIT.toString());
            errorModal.setMessage("User with this email already exist try another email");

            errorList.add(errorModal);
            throw new BusinessException(errorList);

        }

        UserEntity userEntity1 = entityRepository.save(userEntity);
        return userEntity1.getId();
=======
>>>>>>> 9f94eddf5b3efc1521be2354b6eded1d26572fc6:src/main/java/com/my_project/location_management_db/service/ServiceImpl.java
    }
}

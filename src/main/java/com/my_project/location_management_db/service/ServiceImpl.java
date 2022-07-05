package com.my_project.location_management_db.service;

import com.my_project.location_management_db.constant.ErrorType;
import com.my_project.location_management_db.entity.UserEntity;
import com.my_project.location_management_db.excaption.BusinessException;
import com.my_project.location_management_db.excaption.ErrorModal;
import com.my_project.location_management_db.userEntityRepository.UserRepository;
import com.my_project.location_management_db.modal.UserModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    private UserRepository entityRepository;

    @Override
    public boolean login(UserModal userModal) throws BusinessException {
        boolean result;
        UserEntity userEntity = entityRepository.findByEmailAndPassword(userModal.getEmail(), userModal.getPassword());
        if (userEntity == null) {

            List<ErrorModal> errorList = new ArrayList<>();

            ErrorModal errorModal = new ErrorModal();
            errorModal.setCode(ErrorType.AUTH_INVALID_CREDENTIALS.toString());
            errorModal.setMessage("Incorrect email or password");

            errorList.add(errorModal);
            throw new BusinessException(errorList);
        } else {
            result = true;
        }
        return result;
    }
}

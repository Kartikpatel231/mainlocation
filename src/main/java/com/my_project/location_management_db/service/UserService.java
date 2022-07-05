package com.my_project.location_management_db.service;

import com.my_project.location_management_db.excaption.BusinessException;
import com.my_project.location_management_db.modal.UserModal;

public interface UserService {
     boolean login(UserModal userModal) throws BusinessException; //throws BusinessException;
}

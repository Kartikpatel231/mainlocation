package com.my_project.location_management_db.excaption;

import lombok.Data;

import java.util.List;

@Data
public class BusinessException extends Exception {
    private List<ErrorModal> errorList;
    public BusinessException(List<ErrorModal>errorList){
        this.errorList=errorList;
    }
}

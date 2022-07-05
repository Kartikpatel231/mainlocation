package com.my_project.location_management_db.excaption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<List<ErrorModal>> hadleBusinessException(BusinessException b) {
        ResponseEntity<List<ErrorModal>> responseEntity
                = new ResponseEntity<List<ErrorModal>>(b.getErrorList(), HttpStatus.BAD_REQUEST);
        return responseEntity;
    }
}

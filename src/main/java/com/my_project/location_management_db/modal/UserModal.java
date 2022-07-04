package com.my_project.location_management_db.modal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserModal {
    private String userName;
    private String userPassword;
    private String  mobileNo;
    private String email;
    private String address;
}

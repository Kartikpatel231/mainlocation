package com.my_project.location_management_db.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class UserModel {
    private String userName;
    private String userPassword;
    private String mobileNo;
    private String email;
    private String address;
}

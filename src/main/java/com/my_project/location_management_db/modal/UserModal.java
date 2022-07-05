package com.my_project.location_management_db.modal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)   //it autommatically ignore null value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserModal {
    private String fullName;
    private String  mobileNumber;
    private String email;
    private String password;
}

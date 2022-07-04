package com.my_project.location_management_db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity(name="User_Table")
@NoArgsConstructor
public class UserEntity {
    @Column(name = "User_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="User_Name")
    private String userName;
    private String userPassword;
    private String  mobileNo;
    private String email;
    private String address;
}

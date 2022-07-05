package com.my_project.location_management_db.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity(name = "User_Table")
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_Id")
    private long id;

    @Column(name = "User_Name")
    private String userName;

    private String userPassword;
    private String mobileNo;
    private String email;
    private String address;
}

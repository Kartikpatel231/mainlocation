package com.my_project.location_management_db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity(name="User_Table")
@Data                             //getter and setter,equal and hastable,to string
@NoArgsConstructor                //no constructor with arguments
public class UserEntity {
    @Column(name = "User_Id")
    @Id                             //denotes to primary key
    @GeneratedValue(strategy = GenerationType.AUTO)        //value automatic increment by jpa
    private long id;
    @Column(name="FULL_NAME")
    private String fullName;
    private String  mobileNumber;
    private String email;
    private String password;
}

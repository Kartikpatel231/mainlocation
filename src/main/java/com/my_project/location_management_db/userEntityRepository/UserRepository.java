package com.my_project.location_management_db.userEntityRepository;

import com.my_project.location_management_db.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

@Component
public interface UserRepository extends CrudRepository<UserEntity , Long> {
public UserEntity findByEmailAndPassword(String email,String userPassword);
}

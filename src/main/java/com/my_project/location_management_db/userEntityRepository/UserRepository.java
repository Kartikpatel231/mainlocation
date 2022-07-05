package com.my_project.location_management_db.userEntityRepository;

import com.my_project.location_management_db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity , Long> {
 UserEntity findByEmailAndPassword(String email,String password);
 UserEntity findByEmail(String email);
}

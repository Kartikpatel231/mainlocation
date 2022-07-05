package com.my_project.location_management_db.repository;

import com.my_project.location_management_db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmailAndUserPassword(String email, String userPassword);
}

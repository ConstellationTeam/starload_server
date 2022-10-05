package com.example.starload.Repository;

import com.example.starload.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserImpoRepository extends JpaRepository<UserData, Long> {
    //UserData findByUserID(String UserID);
    //UserData findByUserEmail(String UserEmail);
}
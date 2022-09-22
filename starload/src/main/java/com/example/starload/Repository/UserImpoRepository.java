package com.example.starload.Repository;

import com.example.starload.Entity.ReqUserData;
import org.springframework.data.repository.CrudRepository;

public interface UserImpoRepository extends CrudRepository<ReqUserData, Long> {
}

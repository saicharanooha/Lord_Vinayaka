package com.application.Lord_vinyaka.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Lord_vinyaka.entity.UserCredentialsAccoount;
@Repository
public interface UserCredentials extends JpaRepository<UserCredentialsAccoount,Integer> {

}

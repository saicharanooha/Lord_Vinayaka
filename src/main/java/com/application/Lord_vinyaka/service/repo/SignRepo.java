package com.application.Lord_vinyaka.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Lord_vinyaka.entity.UserProfile;
@Repository
public interface SignRepo extends JpaRepository<UserProfile,Integer> {
	
	

}

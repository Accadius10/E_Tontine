package com.koder.etontine.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koder.etontine.Models.User;

public interface UserRepository  extends JpaRepository<User,Long>{
    
}

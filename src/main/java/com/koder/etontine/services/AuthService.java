package com.koder.etontine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koder.etontine.Models.User;
import com.koder.etontine.repo.UserRepository;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepo;

    public boolean saveUser(User user){
        User newUser = userRepo.save(user);
        return true;
    }
}

package com.unialex.products.serviceImpl;

import com.unialex.products.models.Users;
import com.unialex.products.repositories.UsersRepository;
import com.unialex.products.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServicelmpl implements UserService {
    @Autowired
    UsersRepository usersRepository;
    @Override
    public Users createUser(Users users){
        return usersRepository.save(users);
    }
}

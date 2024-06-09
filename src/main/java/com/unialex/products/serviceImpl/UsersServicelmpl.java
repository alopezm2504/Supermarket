package com.unialex.products.serviceImpl;

import com.unialex.products.models.Users;
import com.unialex.products.repositories.UsersRepository;
import com.unialex.products.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServicelmpl implements UserService {
    @Autowired
    UsersRepository usersRepository;
    @Override
    public Users createUser(Users users){
        return usersRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {return usersRepository.findAll();
    }
    @Override
    public Optional<Users> getFindById(int id) {
        return usersRepository.findById(id);
    }

    @Override
    public void deleteUser(Users users) {
        usersRepository.delete(users);
    }


}

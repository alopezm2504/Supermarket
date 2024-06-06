package com.unialex.products.controllers;

import com.unialex.products.models.Users;
import com.unialex.products.repositories.UsersRepository;
import com.unialex.products.serviceImpl.UsersServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UsersServicelmpl usersServicelmpl;
    @PostMapping(value = "create/user")
    public ResponseEntity<Users> createUser(@RequestBody Users users){
        Users usersKept= usersServicelmpl.createUser(users);
        ResponseEntity<Users> response=new ResponseEntity<>(usersKept, HttpStatusCode.valueOf(201));
        return response;
    }
}

package com.unialex.products.controllers;

import com.unialex.products.models.Users;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping(value = "create/user")
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        ResponseEntity<Users> response=new ResponseEntity<>(user, HttpStatusCode.valueOf(201));
        return response;
    }
}

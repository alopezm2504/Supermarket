package com.unialex.products.controllers;

import com.unialex.products.models.Product;
import com.unialex.products.models.Users;
import com.unialex.products.repositories.UsersRepository;
import com.unialex.products.serviceImpl.UsersServicelmpl;
import com.unialex.products.utils.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(value = "get/users")
    public ResponseEntity<List<Users>>getAllUsers(){
        return new ResponseEntity<>(usersServicelmpl.getAllUsers(), HttpStatusCode.valueOf(200));
    }
    @GetMapping(value = "getUser/byId/{id}")
    public ResponseEntity<Optional<Users>>getAllUsers(@PathVariable("id")  int id){
        return new ResponseEntity<>(usersServicelmpl.getFindById(id), HttpStatusCode.valueOf(200));
    }
    @DeleteMapping("Users/delete/{id}")
    public ResponseEntity<Void> deleteUsers(@PathVariable int id) {
        Users users = usersServicelmpl.getFindById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con id: " + id));
        usersServicelmpl.deleteUser(users);
        return ResponseEntity.noContent().build();
    }
}

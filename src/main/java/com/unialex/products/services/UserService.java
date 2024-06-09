package com.unialex.products.services;

import com.unialex.products.models.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Users createUser(Users users);
    List<Users> getAllUsers ();
    Optional<Users> getFindById(int Id);
    void deleteUser(Users users);

}

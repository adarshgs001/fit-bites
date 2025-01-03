package com.diet.fit_bites.users.service;

import java.util.List;

import com.diet.fit_bites.users.data.Users;

public interface UserService {

    Users createUser(Users user);

    List<Users> getUsers();

    Users getUserById(Long id) ;
    
}

package com.diet.fit_bites.users.api;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Description;

import org.springframework.web.bind.annotation.*;

import com.diet.fit_bites.users.data.Users;
import com.diet.fit_bites.users.service.UserService;

import lombok.Builder;
import lombok.Data;

@RestController
@RequestMapping("/api/users")
@Data
@Builder
public class UsersApiResource {


    private final UserService userService;

    @Autowired
    public UsersApiResource(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping
    @Description("Create a new user")
    public Users createUser(@RequestBody Users user) {
        Users createdUser = userService.createUser(user);
        return createdUser;
    }

    @GetMapping
    @Description("Get all users")
    public List<Users> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    @Description("Get user by ID")
    public Users getUserById(@PathVariable Long id) {
        Users user = userService.getUserById(id);
        return user;
    }
}

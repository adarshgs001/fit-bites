package com.diet.fit_bites.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diet.fit_bites.users.data.Users;
import com.diet.fit_bites.users.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    @Override
    public Users createUser(Users user) {
        Users newUser = Users.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .phone(user.getPhone())
                .gender(user.getGender())
                .build();
        this.userRepository.save(newUser);
        return user;
    }

    @Override
    public List<Users> getUsers() {
        return this.userRepository.findAll();
    }


    @Override
    public Users getUserById(Long id) {
        return this.userRepository.findOneByUserId(id);
    }
    
}

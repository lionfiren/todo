package com.example.tolist.TODO.service;


import com.example.tolist.TODO.entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}

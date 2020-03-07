package com.example.tolist.TODO.repository;


import com.example.tolist.TODO.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}

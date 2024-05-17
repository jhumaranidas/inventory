package com.inventory.service;

import com.inventory.entity.User;
import com.inventory.model.request.UserInput;
import org.springframework.cache.annotation.Cacheable;

import java.util.Optional;

public interface UserService {

    public User saveUser(UserInput input);

    @Cacheable(value = "userCache", key="#id")
    public User findById(Long id);


}

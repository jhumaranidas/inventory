package com.inventory.service.impl;


import com.inventory.entity.User;
import com.inventory.model.request.UserInput;
import com.inventory.repository.UserRepository;
import com.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.cache.CacheManager;

import java.util.Optional;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private CacheManager cacheManager;

    @Override
    public User saveUser(UserInput user) {
        User u = new User();
        u.setName(user.getName());
        u.setEmailId(user.getEmailId());
        u.setPassword(user.getPassword());
        return userRepo.save(u);
    }

    @Override
    public User findById(Long id) {
       /* Cache cache = cacheManager.getCache("employeeCache");
        cache.put(3L, "Hello");
        String value = cache.get(3L).get();*/

        Optional<User> user = userRepo.findById(id);
        return user.get();
    }
}

package com.inventory.controller;

import com.inventory.entity.User;
import com.inventory.model.request.UserInput;
import com.inventory.model.response.UserOT;
import com.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/api")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/save")
    public ResponseEntity<UserOT> saveUser(@RequestBody UserInput user) {
        service.saveUser(user);
        return new ResponseEntity<UserOT>(HttpStatus.OK);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {


            User user = service.findById(id);

            System.out.println("............"+user.toString());
            /*return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);*/
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
}

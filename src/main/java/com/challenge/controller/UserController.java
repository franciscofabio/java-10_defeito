package com.challenge.controller;

import com.challenge.entity.User;
import com.challenge.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceInterface userService;

    @GetMapping
    public Iterable<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> findById(@PathVariable("userId") Long userId){
        return this.userService.findById(userId);
    }

    @GetMapping("/findByAccelerationName/{name}")
    public List<User> findByAccelerationName(@PathVariable("name") String name){
        return this.userService.findByAccelerationName(name);
    }

    @GetMapping("/findByCompanyId/{companyId}")
    public List<User> findByCompanyId(@PathVariable("companyId") Long companyId){
        return this.userService.findByCompanyId(companyId);
    }

    @PostMapping
    public User save(@RequestBody User user){
        return this.userService.save(user);
    }
}

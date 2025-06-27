package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "Spring boot";
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "User updated.";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "User saved !";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User Deleted!";
    }

}

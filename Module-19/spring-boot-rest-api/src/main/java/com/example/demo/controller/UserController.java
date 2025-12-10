package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers(){
        return "List of users";
    }

    @PostMapping
    public String createUser(@RequestBody String newUser){
        return "User created with request body: "+ newUser;
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id){
        return "User detail with id: " + id;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody String editedUser){
        return "User updated with request body: " + editedUser + " with id : "+ id;
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable String id){
        return "User deleted with id: "+ id;
    }
}

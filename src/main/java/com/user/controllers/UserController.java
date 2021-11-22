package com.user.controllers;

import com.user.entity.User;
import com.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public List<User> getUser(@PathVariable Long id){
        List address = this.restTemplate.getForObject("http://localhost:8082/address/"+id, List.class);
        List<User> user = this.userService.getUsers(id);
        user.forEach(e->e.setAddress(address));

        return user;
    }
}

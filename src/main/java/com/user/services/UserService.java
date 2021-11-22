package com.user.services;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    List<User> users = List.of(
            new User(1L,"Radheshyam","9834963222"),
            new User(2L,"Arjun","7620554353")
    );

    public List<User> getUsers(Long id){
        return this.users.stream().filter(user->user.getId().equals(id)).collect(Collectors.toList());
    }

}

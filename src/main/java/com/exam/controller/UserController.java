package com.exam.controller;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRoles;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRoles> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleName("Normal");
        UserRoles ur = new UserRoles();
        ur.setUser(user);
        ur.setRole(role);
        roles.add(ur);
        return this.userService.createUser(user, roles);

    }


}

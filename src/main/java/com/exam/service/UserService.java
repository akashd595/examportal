package com.exam.service;

import com.exam.models.User;
import com.exam.models.UserRoles;

import java.util.Set;

public interface UserService {

    //create a user
    public User createUser(User user, Set<UserRoles> userRoles) throws Exception;
}

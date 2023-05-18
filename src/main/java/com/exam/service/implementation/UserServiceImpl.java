package com.exam.service.implementation;

import com.exam.models.User;
import com.exam.models.UserRoles;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public RoleRepository roleRepository;

    //creating a new user
    @Override
    public User createUser(User user, Set<UserRoles> userRoles) throws Exception {

        System.out.println("here 26");
        User local = userRepository.findByUsername(user.getUsername());


        if(local != null){
            System.out.println("here 31");

            //that means it is already present in our database
            System.out.println("User already present");
            throw new Exception("User already present");
        }else{
            System.out.println("here 37");
            System.out.println("userRoles "+userRoles.toString());
            //initially we will add new roles in our roles table
            for (UserRoles ur : userRoles){
                this.roleRepository.save(ur.getRole());
            }
            //we will assign roles to that perticular user from userRoles
            System.out.println("user.getUserRolesSet() "+user.getUserRolesSet());
            user.getUserRolesSet().addAll(userRoles);

      //      user.setUserRolesSet(userRoles);
            System.out.println(user.toString());


            //we will save that user in our database
            local = this.userRepository.save(user);
            System.out.println("local "+local);
        }
        return local;
    }

    @Override
    public User getUser(String username) throws Exception {
        User local = userRepository.findByUsername(username);
        return local;
    }


}

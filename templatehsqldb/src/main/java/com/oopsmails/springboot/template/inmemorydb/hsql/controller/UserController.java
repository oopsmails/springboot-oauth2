/**
 *
 */
package com.oopsmails.springboot.template.inmemorydb.hsql.controller;

import com.oopsmails.springboot.template.inmemorydb.hsql.model.User;
import com.oopsmails.springboot.template.inmemorydb.hsql.service.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(name = "create user", method = RequestMethod.POST, value = "/user")
    User createUser(@RequestBody User user) {
        user = userService.create(user);
        return user;
    }

    @RequestMapping(name = "create users", method = RequestMethod.POST, value = "/users")
    void createUsers(@RequestBody List<User> users) {
        userService.createUsers(users);
    }

    @RequestMapping(name = "get all user", method = RequestMethod.GET, value = "/users")
    List<User> findAllUsers() {
        List<User> users = userService.findAll();
        return users;
    }
}

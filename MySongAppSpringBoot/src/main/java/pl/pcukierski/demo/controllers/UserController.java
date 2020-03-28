package pl.pcukierski.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.pcukierski.demo.dao.UserDAO;
import pl.pcukierski.demo.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/register")
    public UserDAO register(@RequestBody UserDAO userDAO){
         return userService.createUser(userDAO);
    }

    @PutMapping(value = "/edit")
    public UserDAO edit(@RequestBody UserDAO userDAO){
        return userService.editUser(userDAO);
    }

    @PutMapping(value = "/confirm/{id}")
    public UserDAO confirm(@PathVariable(value = "id") Long id){
        return new UserDAO();
    }

    @PostMapping(value = "/add")
    public UserDAO add(@RequestBody UserDAO userDAO){
        return userService.createUser(userDAO);
    }

    // changes
}
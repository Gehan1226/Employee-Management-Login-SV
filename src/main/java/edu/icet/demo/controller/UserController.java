package edu.icet.demo.controller;

import edu.icet.demo.dto.User;
import edu.icet.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public boolean login(@RequestBody User user){
       return userService.login(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }

}

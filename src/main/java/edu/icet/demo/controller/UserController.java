package edu.icet.demo.controller;

import edu.icet.demo.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UserController {

    @PostMapping("/login")
    public boolean login(@RequestBody User user){
       return false;
    }
}

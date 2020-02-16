package com.duzi.SpringInit;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users/create")
    public User create() {
        User user = new User();
        user.setUsername("DUZI");
        return user;
    }
}

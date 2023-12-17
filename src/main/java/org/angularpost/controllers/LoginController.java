package org.angularpost.controllers;

import org.angularpost.repository.LoginInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginInfoRepository loginInfoRepository;

    @PostMapping("/login")
    private String login(@RequestBody LoginController auth) {
        return "ok";
    }
}

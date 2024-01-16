package org.angularpost.controllers;

import org.angularpost.model.AuthenticationInfo;
import org.angularpost.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutenticationController {

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @PostMapping("/authentication/register")
    private AuthenticationInfo register(@RequestBody AuthenticationInfo register) {
        return authenticationRepository.save(register);
    }

    @PostMapping("/authentication/login")
    private List<AuthenticationInfo> login(@RequestBody AuthenticationInfo login) {
        return authenticationRepository.findAll();
    }

}

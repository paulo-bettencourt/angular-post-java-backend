package org.angularpost.controllers;

import org.angularpost.model.RegisterInfo;
import org.angularpost.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private RegisterRepository registerRepository;

    @PostMapping("/register")
    private String auth(@RequestBody RegisterInfo auth) {
        return "ok";
    }

}

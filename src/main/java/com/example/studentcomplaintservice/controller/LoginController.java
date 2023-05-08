package com.example.studentcomplaintservice.controller;

import com.example.studentcomplaintservice.bean.Login;
import com.example.studentcomplaintservice.bean.Response;
import com.example.studentcomplaintservice.interfaces.LoginInterface;
import com.example.studentcomplaintservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class LoginController {

    @Autowired
    final LoginService loginService;
    final LoginInterface loginInterface;

    public LoginController(LoginService loginService, LoginInterface loginInterface) {
        this.loginService = loginService;
        this.loginInterface = loginInterface;
    }

    @PostMapping("/login")
    public ResponseEntity<Response> authenticate(@RequestBody Login login) {
        return loginService.authenticate(login.getRollNumber(), login.getPassword(), login.getRole());

    }


    @PostMapping("/register")
    public ResponseEntity<Login> registerEntity(@RequestBody Login login) {
        return loginInterface.registerEntity(login);
    }
}

package com.example.studentcomplaintservice.interfaces;


import com.example.studentcomplaintservice.bean.ComplaintRecord;
import com.example.studentcomplaintservice.bean.Login;
import com.example.studentcomplaintservice.bean.Response;
import org.springframework.http.ResponseEntity;

public interface LoginInterface {
    ResponseEntity<Response> authenticate(String rollNumber, String password, String role);
    ResponseEntity<Login> registerEntity(Login login);
}

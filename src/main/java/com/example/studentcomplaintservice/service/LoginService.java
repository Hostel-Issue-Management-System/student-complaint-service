package com.example.studentcomplaintservice.service;


import com.example.studentcomplaintservice.bean.ComplaintRecord;
import com.example.studentcomplaintservice.bean.Login;
import com.example.studentcomplaintservice.bean.Response;
import com.example.studentcomplaintservice.interfaces.LoginInterface;
import com.example.studentcomplaintservice.repository.LoginRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LoginService implements LoginInterface {
    @Value("${bcrypt.hash}")
    private String hash;
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public ResponseEntity<Response> authenticate(String rollNumber, String password, String role)

    {
        System.out.println(rollNumber+""+role);
        Login login = loginRepository.findByRollNumberAndRole(rollNumber, role);
        String hashedPassword = BCrypt.hashpw(password,hash);
        if (login == null) {
            return new ResponseEntity<>(new Response("Incorrect Credentials", 400), HttpStatus.NOT_FOUND);
        }
        if (hashedPassword.equals(login.getPassword())) {
            login.setPassword(null);
            return new ResponseEntity<>(new Response(login, 200), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Response("Incorrect Password", 400), HttpStatus.NOT_FOUND);
    }



    @Override
    public ResponseEntity<Login> registerEntity(Login login) {
        String hashedPassword = BCrypt.hashpw(login.getPassword(),hash);
        login.setPassword(hashedPassword);

        Login loginData = loginRepository.save(login);
        return new ResponseEntity<Login>(loginData, HttpStatus.OK);
    }


//    public Optional<Login> findLoginByID(String id){
//        return loginRepository.findById(id);
//    }

}

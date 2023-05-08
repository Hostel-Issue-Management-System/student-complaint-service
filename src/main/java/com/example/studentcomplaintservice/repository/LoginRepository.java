package com.example.studentcomplaintservice.repository;


import com.example.studentcomplaintservice.bean.ComplaintRecord;
import com.example.studentcomplaintservice.bean.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
    Login findByRollNumberAndRole(String rollNumber, String role);



}
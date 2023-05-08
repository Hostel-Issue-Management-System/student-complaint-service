package com.example.studentcomplaintservice.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.*;
@Entity
@Table(name = "Login")
public class Login {
    @Id
    private String rollNumber;

    public Login() {
    }

    private String password;

    public Login(String rollNumber, String password, String role, String name) {
        this.rollNumber = rollNumber;
        this.password = password;
        this.role = role;
        this.name = name;
    }

    private String role;

    private String name;


    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
package com.example.studentcomplaintservice.bean;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @Column(nullable = false)
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNo;


    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Character gender;

    @Column(nullable = false)
    private String password;
    public Student() {

    }

    public Student(String studentId, String name, String phoneNo, String address, Character gender, String password) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender = gender;
        this.password = password;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}

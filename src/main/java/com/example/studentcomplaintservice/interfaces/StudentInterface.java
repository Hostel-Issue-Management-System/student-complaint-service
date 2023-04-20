package com.example.studentcomplaintservice.interfaces;

import com.example.studentcomplaintservice.bean.Response;
import com.example.studentcomplaintservice.bean.Student;
import org.springframework.http.ResponseEntity;

public interface StudentInterface {
    ResponseEntity<Student> addStudent(Student student);
    Response getAllStudents();
//    Response login(Student student);
    Response getStudentByStudentId(String studentId);
}

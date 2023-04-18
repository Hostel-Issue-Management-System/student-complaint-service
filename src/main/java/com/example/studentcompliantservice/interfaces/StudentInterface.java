package com.example.studentcompliantservice.interfaces;

import com.example.studentcompliantservice.bean.Response;
import com.example.studentcompliantservice.bean.Student;
import org.springframework.http.ResponseEntity;

public interface StudentInterface {
    ResponseEntity<Student> addStudent(Student student);
    Response getAllStudents();
//    Response login(Student student);
    Response getStudentByStudentId(String studentId);
}

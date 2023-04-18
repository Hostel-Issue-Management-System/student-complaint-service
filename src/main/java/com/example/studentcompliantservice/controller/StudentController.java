package com.example.studentcompliantservice.controller;

import com.example.studentcompliantservice.bean.Response;
import com.example.studentcompliantservice.bean.Student;
import com.example.studentcompliantservice.interfaces.StudentInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    final StudentInterface studentInterface;

    public StudentController(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return studentInterface.addStudent(student);
    }

    @GetMapping("/getAllStudents")
    public Response getAllStudents() {
        return studentInterface.getAllStudents();
    }

    @PostMapping("/getStudentByStudentId/{studentId}")
    public Response getStudentByStudentId(@PathVariable("studentId") String studentId) {
        return studentInterface.getStudentByStudentId(studentId);
    }
}

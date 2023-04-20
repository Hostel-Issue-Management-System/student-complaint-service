package com.example.studentcomplaintservice.service;

import com.example.studentcomplaintservice.bean.Response;
import com.example.studentcomplaintservice.bean.Student;
import com.example.studentcomplaintservice.interfaces.StudentInterface;
import com.example.studentcomplaintservice.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentInterface {

//    @Value("${bcrypt.hash}")
//    private String hash;
    @Autowired
    final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity<Student> addStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return new ResponseEntity<Student>(savedStudent, HttpStatus.OK);
    }

    @Override
    public Response getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).setPassword(null);
        }
        return new Response(studentList, 200);
    }

    @Override
    public Response getStudentByStudentId(String studentId) {
        Student student = studentRepository.getStudentByStudentId(studentId);
        if (student == null) {
            return new Response(null, 400);
        }
        return new Response(student, 200);
    }


}

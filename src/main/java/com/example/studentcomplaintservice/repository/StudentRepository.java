package com.example.studentcomplaintservice.repository;

import com.example.studentcomplaintservice.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    Student getStudentByStudentId(String studentId);

//    Response login(Student student);

}

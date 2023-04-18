package com.example.studentcompliantservice.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompliantRecord {
    public CompliantRecord(Integer compliantId, String title, String description, String studentId, String status) {
        this.compliantId = compliantId;
        this.title = title;
        this.description=description;
        this.status=status;
        this.studentId=studentId;
    }

    public CompliantRecord(){}


    @Id
    @Column(nullable = false)
    private Integer compliantId;
    @Column(nullable = false, unique = true)
    String title;
    @Column(nullable = false, unique = true)
    String description;
    @Column(nullable = false, unique = true)
    String status;

    public Integer getCompliantId() {
        return compliantId;
    }

    public void setCompliantId(Integer compliantId) {
        this.compliantId = compliantId;
    }

    @Column(nullable = false, unique = true)
    String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

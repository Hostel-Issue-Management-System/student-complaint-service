package com.example.studentcomplaintservice.bean;

import jakarta.persistence.*;

@Entity
public class ComplaintRecord {
    public ComplaintRecord(String complaintType, Integer roomNumber, String description, String rollNumber, String status) {
        this.complaintType= complaintType;;
        this.roomNumber = roomNumber;
        this.description=description;
        this.status=status;
        this.rollNumber=rollNumber;
    }

    public ComplaintRecord(){}


    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer complaintId;
    @Column
    String complaintType;
    @Column
    Integer roomNumber;
    @Column
    String description;
    @Column
    String status;

    @Column
    String rollNumber;


    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
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

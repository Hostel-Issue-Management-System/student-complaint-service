package com.example.studentcomplaintservice.interfaces;

import com.example.studentcomplaintservice.bean.ComplaintRecord;


import com.example.studentcomplaintservice.bean.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface ComplaintRecordInterface {


    ResponseEntity<ComplaintRecord> addComplaintRecord(ComplaintRecord complaintRecord);
    ResponseEntity<ComplaintRecord> getComplaintRecordByComplaintId(Integer Id);

    ResponseEntity<List<ComplaintRecord>> getComplaintRecordByStudentId(String studentId);

    Response getAllComplaintRecords();


    ResponseEntity<ComplaintRecord> updateComplaintRecord(Integer complaintId,ComplaintRecord complaintRecord);


    ResponseEntity<ComplaintRecord> resolveComplaintRecordByComplaintId(Integer complaintId);

    // delete employee rest api
    ResponseEntity<Map<String, Boolean>> deleteComplaintRecordByComplaintId(Integer complaintId);

}

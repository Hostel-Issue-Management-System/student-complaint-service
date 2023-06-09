package com.example.studentcomplaintservice.interfaces;
import com.example.studentcomplaintservice.bean.ComplaintRecord;
import com.example.studentcomplaintservice.bean.Response;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

public interface ComplaintRecordInterface {

    Response addComplaintRecord(ComplaintRecord complaintRecord);
    ResponseEntity<ComplaintRecord> getComplaintRecordByComplaintId(Integer Id);

    ResponseEntity<List<ComplaintRecord>> getComplaintRecordByRollNumber(String rollNumber);

    ResponseEntity<List<ComplaintRecord>> getAllComplaintRecords();


    ResponseEntity<ComplaintRecord> updateComplaintRecord(Integer complaintId,ComplaintRecord complaintRecord);


    ResponseEntity<ComplaintRecord> resolveComplaintRecordByComplaintId(Integer complaintId);

    ResponseEntity<Map<String, Boolean>> deleteComplaintRecordByComplaintId(Integer complaintId);

}

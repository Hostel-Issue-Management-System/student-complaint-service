package com.example.studentcomplaintservice.controller;
import com.example.studentcomplaintservice.bean.ComplaintRecord;
import com.example.studentcomplaintservice.bean.Response;
import com.example.studentcomplaintservice.interfaces.ComplaintRecordInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/complaintRecord")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ComplaintRecordController {

    @Autowired
    final ComplaintRecordInterface complaintRecordInterface;


    public ComplaintRecordController(ComplaintRecordInterface complaintRecordInterface) {
        this.complaintRecordInterface = complaintRecordInterface;
    }


    @PostMapping("/addComplaintRecord")
    public ResponseEntity<ComplaintRecord> addComplaintRecord(@RequestBody ComplaintRecord complaintRecord) {
        return complaintRecordInterface.addComplaintRecord(complaintRecord);
    }

    @GetMapping("/getAllComplaintRecords")
    public Response getAllComplaintRecords() {
        return complaintRecordInterface.getAllComplaintRecords();
    }


    @PostMapping("/getComplaintRecordByComplaintId/{complaintId}")
    public ResponseEntity<ComplaintRecord> getComplaintRecordByComplaintId(@PathVariable("complaintId") Integer complaintId) {
        return complaintRecordInterface.getComplaintRecordByComplaintId(complaintId);
    }

    @PostMapping("/getComplaintRecordByRollNumber/{rollNumber}")
    public ResponseEntity<List<ComplaintRecord>> getComplaintRecordByRollNumber(@PathVariable("rollNumber") String rollNumber) {
        return complaintRecordInterface.getComplaintRecordByRollNumber(rollNumber);
    }


    @PutMapping("/updateComplaintRecord")
    public ResponseEntity<ComplaintRecord> updateComplaintRecord(@RequestBody ComplaintRecord complaintRecord){
        return complaintRecordInterface.updateComplaintRecord(complaintRecord.getComplaintId(),complaintRecord);
    }

    @PutMapping("/resolveComplaintRecordByComplaintId/{complaintId}")
    public ResponseEntity<ComplaintRecord> resolveComplaintRecordByComplaintId(@PathVariable("complaintId") Integer complaintId) {
        return complaintRecordInterface.resolveComplaintRecordByComplaintId(complaintId);
    }

    @DeleteMapping("/deleteComplaintRecordByComplaintId/{complaintId}")
    public ResponseEntity<Map<String, Boolean>> deleteComplaintRecordByComplaintId(@PathVariable("complaintId") Integer complaintId){
            return complaintRecordInterface.deleteComplaintRecordByComplaintId(complaintId);
        }

}

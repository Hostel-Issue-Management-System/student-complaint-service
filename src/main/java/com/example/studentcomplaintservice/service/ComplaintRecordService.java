package com.example.studentcomplaintservice.service;
import com.example.studentcomplaintservice.bean.ComplaintRecord;
import com.example.studentcomplaintservice.bean.Response;
import com.example.studentcomplaintservice.interfaces.ComplaintRecordInterface;
import com.example.studentcomplaintservice.repository.ComplaintRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ComplaintRecordService implements ComplaintRecordInterface {

    @Autowired
    final ComplaintRecordRepository complaintRecordRepository;

    public ComplaintRecordService(ComplaintRecordRepository complaintRecordRepository) {
        this.complaintRecordRepository = complaintRecordRepository;
    }
    @Override
    public ResponseEntity<ComplaintRecord> getComplaintRecordByComplaintId(Integer complaintId){
        ComplaintRecord complaintRecord = complaintRecordRepository.getComplaintRecordByComplaintId(complaintId);
        if (complaintRecord == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ComplaintRecord>(complaintRecord, HttpStatus.OK);
    }
    @Override
    public Response addComplaintRecord(ComplaintRecord complaintRecord) {
        ComplaintRecord complaintRecordData = complaintRecordRepository.save(complaintRecord);
            return new Response(complaintRecordData, 200);
    }

    @Override
    public ResponseEntity<List<ComplaintRecord>> getAllComplaintRecords() {
        List<ComplaintRecord> complaintRecord = complaintRecordRepository.findAll();
        System.out.println(complaintRecord);
        return new ResponseEntity<List<ComplaintRecord>>(complaintRecord,  HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ComplaintRecord>> getComplaintRecordByRollNumber(String rollNumber){
        List<ComplaintRecord> listOfComplaintRecord = complaintRecordRepository.getComplaintRecordByRollNumber(rollNumber);
        if (listOfComplaintRecord == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<ComplaintRecord>>(listOfComplaintRecord, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<ComplaintRecord> updateComplaintRecord(Integer complaintId,ComplaintRecord complaintRecord){
        ComplaintRecord complaintUpdateRecord = complaintRecordRepository.getComplaintRecordByComplaintId(complaintId);
        complaintUpdateRecord.setComplaintType(complaintRecord.getComplaintType());
        complaintUpdateRecord.setDescription(complaintRecord.getDescription());
        complaintUpdateRecord.setRoomNumber(complaintRecord.getRoomNumber());
        complaintUpdateRecord.setRollNumber(complaintRecord.getRollNumber());
        complaintUpdateRecord.setStatus("Open");
        ComplaintRecord updatedEmployee = complaintRecordRepository.save(complaintUpdateRecord);
        return ResponseEntity.ok(updatedEmployee);
    }

    @Override
    public ResponseEntity<ComplaintRecord> resolveComplaintRecordByComplaintId(Integer complaintId){
        ComplaintRecord complaintUpdateRecord = complaintRecordRepository.getComplaintRecordByComplaintId(complaintId);
        complaintUpdateRecord.setStatus("Close");
        ComplaintRecord updatedEmployee = complaintRecordRepository.save(complaintUpdateRecord);
        return ResponseEntity.ok(updatedEmployee);
    }
    @Override
    public ResponseEntity<Map<String, Boolean>> deleteComplaintRecordByComplaintId(Integer complaintId){
        ComplaintRecord complaintDeleteRecord = complaintRecordRepository.getComplaintRecordByComplaintId(complaintId);
        complaintRecordRepository.delete(complaintDeleteRecord);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}


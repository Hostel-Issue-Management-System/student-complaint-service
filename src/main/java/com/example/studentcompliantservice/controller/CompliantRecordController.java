package com.example.studentcompliantservice.controller;

import com.example.studentcompliantservice.bean.CompliantRecord;
import com.example.studentcompliantservice.bean.Response;
import com.example.studentcompliantservice.interfaces.CompliantRecordInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/complaintRecord")
public class CompliantRecordController {

    @Autowired
    final CompliantRecordInterface compliantRecordInterface;

    public CompliantRecordController(CompliantRecordInterface compliantRecordInterface) {
        this.compliantRecordInterface = compliantRecordInterface;
    }


    @PostMapping("/addCompliantRecord")
    public ResponseEntity<CompliantRecord> addCompliantRecord(@RequestBody CompliantRecord compliantRecord) {
        return compliantRecordInterface.addCompliantRecord(compliantRecord);
    }

    @GetMapping("/getAllCompliantRecords")
    public Response getAllCompliantRecords() {
        return compliantRecordInterface.getAllCompliantRecords();
    }


    @PostMapping("/getCompliantRecordByCompliantId/{compliantId}")
    public ResponseEntity<CompliantRecord> getCompliantRecordByCompliantId(@PathVariable("compliantId") Integer compliantId) {
        return compliantRecordInterface.getCompliantRecordByCompliantId(compliantId);
    }





//    @PostMapping("/getPatientData/{id}/{recordType}")
//    public ResponseEntity<PatientData> getPatientDataByIdAndRecordType(@PathVariable(value = "id") Integer abhaId,@PathVariable(value = "recordType") String recordType)  {
//        return complaintRecordInterface.findByIdAndRecordType(abhaId,recordType);
//    }

}

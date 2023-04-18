package com.example.studentcompliantservice.service;

import com.example.studentcompliantservice.bean.CompliantRecord;
import com.example.studentcompliantservice.bean.Response;
import com.example.studentcompliantservice.interfaces.CompliantRecordInterface;
import com.example.studentcompliantservice.repository.CompliantRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompliantRecordService implements CompliantRecordInterface {

    @Autowired
    final CompliantRecordRepository compliantRecordRepository;

    public CompliantRecordService(CompliantRecordRepository compliantRecordRepository) {
        this.compliantRecordRepository = compliantRecordRepository;
    }
    @Override
    public ResponseEntity<CompliantRecord> getCompliantRecordByCompliantId(Integer complaintId){
        CompliantRecord compliantRecord = compliantRecordRepository.getCompliantRecordByCompliantId(complaintId);
        if (compliantRecord == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CompliantRecord>(compliantRecord, HttpStatus.OK);
    }
    @Override
    public ResponseEntity<CompliantRecord> addCompliantRecord(CompliantRecord compliantRecord) {
        CompliantRecord compliantRecordData = compliantRecordRepository.save(compliantRecord);
            return new ResponseEntity<CompliantRecord>(compliantRecordData, HttpStatus.OK);
    }

    @Override
    public Response getAllCompliantRecords() {
        List<CompliantRecord> compliantRecord = compliantRecordRepository.findAll();
        return new Response(compliantRecord, 200);
    }

}


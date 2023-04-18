package com.example.studentcompliantservice.interfaces;

import com.example.studentcompliantservice.bean.CompliantRecord;

import com.example.studentcompliantservice.bean.Response;
import org.springframework.http.ResponseEntity;

public interface CompliantRecordInterface {


    ResponseEntity<CompliantRecord> addCompliantRecord(CompliantRecord compliantRecord);
    ResponseEntity<CompliantRecord> getCompliantRecordByCompliantId(Integer Id);

    Response getAllCompliantRecords();
}

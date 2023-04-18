package com.example.studentcompliantservice.repository;

import com.example.studentcompliantservice.bean.CompliantRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompliantRecordRepository extends JpaRepository<CompliantRecord, Integer> {


//    CompliantRecord addCompliantRecord(CompliantRecord compliantRecord);
    CompliantRecord getCompliantRecordByCompliantId(Integer compliantId);

}

package com.example.studentcomplaintservice.repository;
import com.example.studentcomplaintservice.bean.ComplaintRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ComplaintRecordRepository extends JpaRepository<ComplaintRecord, Integer> {

    ComplaintRecord getComplaintRecordByComplaintId(Integer complaintId);

    List<ComplaintRecord> getComplaintRecordByRollNumber(String rollNumber);


}

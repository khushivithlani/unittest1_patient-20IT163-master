package com.example.demo.repositories;

import com.example.demo.model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long>, JpaSpecificationExecutor<PatientRecord> {

}

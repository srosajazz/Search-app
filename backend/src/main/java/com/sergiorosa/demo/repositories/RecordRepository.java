package com.sergiorosa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergiorosa.demo.entities.Record;

@Repository
public interface RecordRepository  extends JpaRepository<Record, Long> {

}

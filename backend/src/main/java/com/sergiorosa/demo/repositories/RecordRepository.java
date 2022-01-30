package com.sergiorosa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.demo.entities.Record;


public interface RecordRepository  extends JpaRepository<Record, Long> {

}

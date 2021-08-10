package com.renanrosas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanrosas.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

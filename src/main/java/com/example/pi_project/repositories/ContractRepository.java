package com.example.pi_project.repositories;

import com.example.pi_project.entities.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract,Integer> {
}

package com.example.pi_project.repositories;

import com.example.pi_project.entities.Delivery;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends MongoRepository<Delivery,Integer> {

}

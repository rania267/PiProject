package com.example.pi_project.services;

import com.example.pi_project.entities.Contract;
import com.example.pi_project.entities.Delivery;
import com.example.pi_project.repositories.ContractRepository;
import com.example.pi_project.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiServiceImpl implements IPiService{
@Autowired
    DeliveryRepository deliveryRepository;
@Autowired
    ContractRepository contractRepository;

    @Override
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }
    @Override
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }
    @Override
    public Contract getContractById(int id) {
        return contractRepository.findById(id).orElse(null);
    }


    @Override
    public Delivery addDelivery(Delivery delivery) {
       return  deliveryRepository.save(delivery);

    }

    @Override
    public Contract addContract(Contract contract) {
        return contractRepository.save(contract);
    }
    @Override
    public Contract updateContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public void deleteContract(int id) {
        contractRepository.deleteById(id);
    }
    @Override
    public Delivery updateDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public void deleteDelivery(int id) {
        deliveryRepository.deleteById(id);
    }
}

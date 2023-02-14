package com.example.pi_project.services;

import com.example.pi_project.entities.Contract;
import com.example.pi_project.entities.Delivery;

import java.util.List;

public interface IPiService {
    public List<Delivery> getAllDeliveries();
    public List<Contract> getAllContracts();
    public Delivery addDelivery(Delivery delivery);
    public Contract addContract(Contract contract);
    public void deleteDelivery(int id);
    public Delivery updateDelivery(Delivery delivery);
    public void deleteContract(int id);
    public Contract updateContract(Contract contract);
}

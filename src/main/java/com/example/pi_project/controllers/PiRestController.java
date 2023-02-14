package com.example.pi_project.controllers;

import com.example.pi_project.entities.Contract;
import com.example.pi_project.entities.Delivery;
import com.example.pi_project.services.IPiService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PiRestController {
    @Autowired
    IPiService piService;


    @GetMapping("/AllContracts")
    @ResponseBody
    public List<Contract> getAllContracts(){
        return piService.getAllContracts();
    }

    @GetMapping("/AllDeliveries")
    @ResponseBody
    public List<Delivery> getAllDeliveries(){
        return piService.getAllDeliveries();
    }
    @PostMapping("/addDelivery")
    @ResponseBody
    public Delivery addDelivery (@RequestBody Delivery delivery) {
        return piService.addDelivery(delivery);
    }
    @PostMapping("/addContract")
    public Contract addContract (@RequestBody Contract contract) {
        return piService.addContract(contract);
    }
    @PutMapping("/updateDelivery")
    @ResponseBody
    public Delivery updateDelivery(@RequestBody Delivery delivery){
        return piService.updateDelivery(delivery);
    }
    @PutMapping("/updateContract")
    @ResponseBody
    public Contract updateContract(@RequestBody Contract contract){
        return piService.updateContract(contract);
    }
    @DeleteMapping("/deleteDelivery/{id}")
    @ResponseBody
    public void deleteDelivery(@PathVariable("id")int id){
        piService.deleteDelivery(id);
    }


    @DeleteMapping("/deleteContract/{id}")
    @ResponseBody
    public void deleteContract(@PathVariable("id")int id){
        piService.deleteContract(id);
    }

    }


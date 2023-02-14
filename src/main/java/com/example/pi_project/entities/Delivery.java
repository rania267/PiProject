package com.example.pi_project.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Delivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String quantity;
    private float totalHT;
    private String address;
    private float unitPrice;
    private Long numOrder;
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;
    @Enumerated(EnumType.STRING)
    private State deliveryState;

}

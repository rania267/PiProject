package com.example.pi_project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long numOrder;
    private String deliveryDelay;
    private String condition;
    private String engagement;
    private String quantity;
    private String option;
    private String orderAddress;
    private float deliveryPrice;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @JsonIgnore
    @OneToOne(mappedBy = "contract" , cascade = CascadeType.ALL)
    private  Delivery delivery;


}

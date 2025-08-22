package com.dh.ClinicaOdontologicaSpring.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name = "Patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer id;
    private String name;
    private String lastname;
    private Integer cardIdentity;
    private LocalDate admissionOfDate;

}

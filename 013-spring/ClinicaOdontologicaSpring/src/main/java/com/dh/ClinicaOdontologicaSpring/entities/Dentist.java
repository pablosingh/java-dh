package com.dh.ClinicaOdontologicaSpring.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Dentists")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dentist_id")
    private Integer id;
    private Integer registration;
    private String name;
    private String lastname;

    public Dentist() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

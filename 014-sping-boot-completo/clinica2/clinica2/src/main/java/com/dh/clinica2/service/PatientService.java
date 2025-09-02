package com.dh.clinica2.service;

import com.dh.clinica2.entities.Patient;
import com.dh.clinica2.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private PatientRepository repository;

    @Autowired
    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Patient save(Patient patient) {
        return repository.save(patient);
    }

    public Optional<Patient> findById(Integer id) {
        return repository.findById(id);
    }

    public void update(Patient patient) {
        repository.save(patient);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Patient> findAll() {
        return repository.findAll();
    }

}

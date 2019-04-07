package com.example.carssharing.services;

import com.example.carssharing.model.Transmission;
import com.example.carssharing.repositories.TransmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransmissionService implements ToUpperCase{
    private TransmissionRepository repository;

    public TransmissionService(TransmissionRepository repository) {
        this.repository = repository;
    }

    public Iterable<Transmission> findAll() {
        return repository.findAll();
    }

    public Transmission findById(int id) {
        return repository.findById(id);
    }

    public void delete(Transmission object) {
        repository.delete(object);
    }

    public void save(Transmission object) throws Exception {
        if(repository.findByNameIgnoreCase(object.getName())==null) {
            object.setName(upper(object.getName()));
            repository.save(object);
            return;
        }
        throw new Exception("Тип коробки передач "+upper(object.getName())+" уже существует");
    }
}
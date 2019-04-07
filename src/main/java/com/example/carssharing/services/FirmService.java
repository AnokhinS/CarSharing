package com.example.carssharing.services;

import com.example.carssharing.model.Firm;
import com.example.carssharing.repositories.FirmRepository;
import org.springframework.stereotype.Service;

@Service
public class FirmService implements ToUpperCase{
    private FirmRepository repository;

    public FirmService(FirmRepository repository) {
        this.repository = repository;
    }

    public Iterable<Firm> findAll() {
        return repository.findAll();
    }

    public Firm findById(int id) {
        return repository.findById(id);
    }

    public void delete(Firm object) {
        repository.delete(object);
    }

    public void save(Firm object) throws Exception {
        if(repository.findByNameIgnoreCase(object.getName())==null) {
            object.setName(upper(object.getName()));
            repository.save(object);
            return;
        }
        throw new Exception("Фирма "+upper(object.getName())+" уже существует");
    }
}
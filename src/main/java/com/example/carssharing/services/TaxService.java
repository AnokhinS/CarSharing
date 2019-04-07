package com.example.carssharing.services;

import com.example.carssharing.model.Tax;
import com.example.carssharing.repositories.TaxRepository;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    private TaxRepository repository;

    public TaxService(TaxRepository repository) {
        this.repository = repository;
    }

    public Iterable<Tax> findAll() {
        return repository.findAll();
    }

    public Tax findById(long id) {
        return repository.findById(id);
    }

    public void delete(Tax object) {
        repository.delete(object);
    }

    public void save(Tax object) throws Exception{
        repository.save(object);
    }
}
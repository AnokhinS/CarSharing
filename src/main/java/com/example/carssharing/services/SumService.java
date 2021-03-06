package com.example.carssharing.services;

import com.example.carssharing.model.Sum;
import com.example.carssharing.repositories.SumRepository;
import org.springframework.stereotype.Service;

@Service
public class SumService implements ToUpperCase{
    private SumRepository repository;

    public SumService(SumRepository repository) {
        this.repository = repository;
    }

    public Iterable<Sum> findAll() {
        return repository.findAll();
    }

    public Sum findById(int id) {
        return repository.findById(id);
    }

    public void delete(Sum object) {
        repository.delete(object);
    }

    public void save(Sum object) throws Exception {
            repository.save(object);
    }
}
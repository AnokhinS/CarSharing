package com.example.carssharing.repositories;

import com.example.carssharing.model.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransmissionRepository extends JpaRepository<Transmission, Integer> {
    Transmission findById(int id);

    Transmission findByNameIgnoreCase(String name);
}


package com.example.carssharing.repositories;

import com.example.carssharing.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findById(long id);
    Car findByNumber(String number);
}

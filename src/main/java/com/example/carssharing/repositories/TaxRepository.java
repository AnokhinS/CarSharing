package com.example.carssharing.repositories;

import com.example.carssharing.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepository extends JpaRepository<Tax, Long> {
    Tax findById(long id);
}

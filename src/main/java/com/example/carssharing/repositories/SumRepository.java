package com.example.carssharing.repositories;

import com.example.carssharing.model.Sum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumRepository extends JpaRepository<Sum, Long> {
    Sum findById(long id);
}


package com.example.carssharing.services;

import com.example.carssharing.model.Notification;
import com.example.carssharing.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements ToUpperCase{
    private NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public Notification findById(long id) {
        return repository.findById(id);
    }

    public List<Notification> findByUser(long id){
        return repository.findByUserAndReadFalseOrderByDateDesc(id);
    }

    public void save(Notification object){
            repository.save(object);
    }
}

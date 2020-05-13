package com.demiurgos.springboot_h2.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {

    @Autowired
    private SubscriberRepository repository;

    @PostMapping("/saveSubscriber")
    public String saveSubscriber(@RequestBody Subscriber subscriber) {

        repository.save(subscriber);
        return "subscriber saved";
    }

    @GetMapping("/getAllSubscribers")
    public List<Subscriber> getAll() {
        return (List<Subscriber>) repository.findAll();
    }

    @GetMapping("/getSubscriber/{id}")
    public Optional<Subscriber> getSubscriberById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/deleteSubscriber/{id}")
    public String deleteSubscriberById(@PathVariable Long id){
        repository.deleteById(id);
        
        return "Subscriber Deleted";
    }

    @GetMapping("/getByCategory/{category}")
    public List<Subscriber> getByCategory(@PathVariable String category){
        return repository.getByCategory(category);
}



    
}
package com.demiurgos.springboot_h2.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

	List<Subscriber> getByCategory(String category);
    
    
}
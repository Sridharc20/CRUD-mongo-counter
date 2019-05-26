package com.assignment.assignment.repository;

import com.assignment.assignment.model.Counter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface CounterRepo extends MongoRepository<Counter, Integer> {



}

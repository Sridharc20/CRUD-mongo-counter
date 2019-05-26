package com.assignment.assignment.repository;

import com.assignment.assignment.model.Jobs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.support.SpringDataMongodbQuery;

public interface JobsRepo extends MongoRepository<Jobs, String> {
}

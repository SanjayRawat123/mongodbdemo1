package com.mongo.example.mongodbdemo.repository;

import com.mongo.example.mongodbdemo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepositroy extends MongoRepository<Student,Integer> {

}

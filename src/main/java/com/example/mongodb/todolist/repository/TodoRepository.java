package com.example.mongodb.todolist.repository;

import com.example.mongodb.todolist.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}

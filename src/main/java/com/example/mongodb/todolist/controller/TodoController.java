package com.example.mongodb.todolist.controller;

import com.example.mongodb.todolist.Todo;
import com.example.mongodb.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    /**
     * Saves the Todo instance to Mongodb Database.
     * @param todo Todo object
     */

    @RequestMapping("/create")
    public void create(@RequestBody Todo todo){
        todoRepository.save( todo );
        System.out.println("Todo created Successfully");
    }

    @RequestMapping("/all")
    public List<Todo> readAll(){
        return todoRepository.findAll();
    }

}

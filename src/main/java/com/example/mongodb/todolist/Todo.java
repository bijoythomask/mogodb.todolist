package com.example.mongodb.todolist;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "todo")
public class Todo {

    @Id
    public String id;
    public String title;

}

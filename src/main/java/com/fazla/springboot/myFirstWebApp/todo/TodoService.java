package com.fazla.springboot.myFirstWebApp.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    static {
        todoList.add(new Todo.Builder().setId(1).setUsername("fazla").setDescription("Learn Spring").setTargetDate(LocalDate.now().plusMonths(1)).setDone(false).build());
        todoList.add(new Todo(2,"fazla","Learn react",LocalDate.now().plusMonths(3),false));
        todoList.add(new Todo(3,"fazla","Learn aws",LocalDate.now().plusMonths(6),false));
    }

    public List<Todo> findByUsername(String user){
        return todoList;
    }
}

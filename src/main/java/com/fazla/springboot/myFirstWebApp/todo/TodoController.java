package com.fazla.springboot.myFirstWebApp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService=todoService;
    }

    @RequestMapping("/todo")
    public String getTodoList(ModelMap modelMap){
        List<Todo> todoList = todoService.findByUsername("fazla");
        modelMap.put("todoList",todoList);
        return "todo";
    }
}

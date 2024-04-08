package de.pan.todobackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todobackend.model.TodoItem;
import de.pan.todobackend.repository.TodoItemRepository;
import de.pan.todobackend.services.HelloService;

@RestController
public class HelloController {
    private HelloService helloService;
    private TodoItemRepository todoItemRepository;

    public HelloController(HelloService helloService, TodoItemRepository todoItemRepository) {
        this.helloService = helloService;
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping("hello")
    public Iterable<TodoItem> helloEndpoint() {
        return this.todoItemRepository.findAll();
    }
}

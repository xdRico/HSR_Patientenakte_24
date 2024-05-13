package de.pan.todofrontend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todofrontend.model.TodoItem;
import de.pan.todofrontend.service.BackendService;

@RestController
public class TodoItemController {
    private BackendService backendService;

    public TodoItemController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/items")
    public List<TodoItem> getTodoItems() {
        return backendService.getTodoItems();
    }

    @GetMapping("/create")
    public TodoItem createTodoItem() {
        return backendService.createTodoItem(new TodoItem("Test", "Test"));
    }
}

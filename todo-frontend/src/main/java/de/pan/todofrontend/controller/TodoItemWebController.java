package de.pan.todofrontend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.pan.todofrontend.model.TodoItem;
import de.pan.todofrontend.service.BackendService;

@Controller
public class TodoItemWebController {
    private static final Logger log = LoggerFactory.getLogger(TodoItemWebController.class);

    private final BackendService backendService;

    public TodoItemWebController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/todos")
    public String todoItemList(Model model) {
        log.info("Received GET request on /todos. Serving todoItems.html");
        model.addAttribute("todo", new TodoItem("", ""));
        model.addAttribute("todos", backendService.getTodoItems());
        return "todoItems";
    }

    @PostMapping("/todos")
    public String createTodoItem(Model model, @ModelAttribute("todo") TodoItem todoItem) {
        log.info("Received POST request on /todos with todo(name: {}, description: {}", todoItem.getTodoItemName(), todoItem.getTodoItemDescription());
        backendService.createTodoItem(todoItem);
        log.info("Redirecting to /todos");
        return "redirect:/todos";
    }
}


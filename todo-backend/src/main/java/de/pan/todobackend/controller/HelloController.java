package de.pan.todobackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    //swamp of POX
    @RequestMapping("/hello")
    public Iterable<TodoItem> helloEndpoint() {
        return this.todoItemRepository.findAll();
    }

    // Level 1: Resources:
    @RequestMapping("/todo")
    public Iterable<TodoItem> getAllTodoItems(){
        return this.todoItemRepository.findAll();
    }


    @RequestMapping("/todo/getTodoItemById/{id}")
    public ResponseEntity<TodoItem> getTodoItemByIdLevel1(@PathVariable Integer id){
        var item = todoItemRepository.findById(id).orElse(null);
        if(item != null){
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build(); 
    }

    // Level 2: Verb
    @GetMapping("/todo/{id}")
    public ResponseEntity<TodoItem> getTodoById(@PathVariable Integer id){
        var item = todoItemRepository.findById(id).orElse(null);
        if(item != null){
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build(); 
    }

    @PostMapping("/todo/{name}")
    public ResponseEntity<TodoItem> postTodoItem(@PathVariable String name){
        var item = new TodoItem();
        item.setTodoItemName(name);
        todoItemRepository.save(item);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @PutMapping("/todo/{id}/{name}")
    public ResponseEntity<TodoItem> UpdateTodoItem(@PathVariable Integer id, @PathVariable String name ){
       var existingItem = todoItemRepository.findById(id).orElse(null);
       if(existingItem != null){
            existingItem.setTodoItemName(name);
            todoItemRepository.save(existingItem);
            return ResponseEntity.ok().body(existingItem);
       }
       return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<TodoItem> deleteTodoItem(@PathVariable Integer id){
        var existingItem = todoItemRepository.findById(id).orElse(null);
        if(existingItem != null){
            todoItemRepository.delete(existingItem);
            return ResponseEntity.ok().body(existingItem);
        }
        return ResponseEntity.notFound().build();
    }

}

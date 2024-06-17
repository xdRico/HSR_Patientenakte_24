package de.pan.todobackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todobackend.model.TodoItem;
import de.pan.todobackend.repository.TodoItemRepository;

@RestController
public class TodoController {
    private static final Logger log = LoggerFactory.getLogger(TodoController.class);

    private TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping("/todo")
    public Iterable<TodoItem> getAllTodoItems(){
        return this.todoItemRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<TodoItem> getTodoById(@PathVariable Integer id){
        var item = todoItemRepository.findById(id).orElse(null);

        if(item == null){
            return ResponseEntity.notFound().build(); 
        }
        
        return ResponseEntity.ok().body(item);
    }

    @PostMapping("/todo")
    public ResponseEntity<TodoItem> postTodoItem(@RequestBody TodoItem item){
        var createdItem = todoItemRepository.save(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);

    }

    @PutMapping("/todo/{id}/{name}")
    public ResponseEntity<TodoItem> UpdateTodoItem(@PathVariable Integer id, @PathVariable String name ){
       var existingItem = todoItemRepository.findById(id).orElse(null);

       if(existingItem == null){
            return ResponseEntity.notFound().build();
       }

       existingItem.setTodoItemName(name);
       todoItemRepository.save(existingItem);
       return ResponseEntity.ok().body(existingItem);
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<TodoItem> deleteTodoItem(@PathVariable Integer id){
        var existingItem = todoItemRepository.findById(id).orElse(null);

        if(existingItem == null){
            return ResponseEntity.notFound().build();
        }
        
        todoItemRepository.delete(existingItem);
        return ResponseEntity.ok().build();
    }
}

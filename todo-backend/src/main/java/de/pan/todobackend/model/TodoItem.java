package de.pan.todobackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class TodoItem {
    @Id
    @GeneratedValue
    private int todoItemId;
    private String todoItemName;
    private String todoItemDescription;
    
    public TodoItem() {
    }

    public TodoItem(int todoItemId, String todoItemName, String todoItemDescription) {
        this.todoItemId = todoItemId;
        this.todoItemName = todoItemName;
        this.todoItemDescription = todoItemDescription;
    }

    public int getTodoItemId() {
        return todoItemId;
    }

    public void setTodoItemId(int todoItemId) {
        this.todoItemId = todoItemId;
    }

    public String getTodoItemName() {
        return todoItemName;
    }

    public void setTodoItemName(String todoItemName) {
        this.todoItemName = todoItemName;
    }

    public String getTodoItemDescription() {
        return todoItemDescription;
    }

    public void setTodoItemDescription(String todoItemDescription) {
        this.todoItemDescription = todoItemDescription;
    }
}

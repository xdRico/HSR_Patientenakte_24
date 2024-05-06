package de.pan.todofrontend.model;

public class TodoItem {
    private String todoItemName;
    private String todoItemDescription;

    public TodoItem() {
    }

    public TodoItem(String todoItemName, String todoItemDescription) {
        this.todoItemName = todoItemName;
        this.todoItemDescription = todoItemDescription;
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

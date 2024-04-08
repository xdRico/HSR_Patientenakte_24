package de.pan.todobackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.pan.todobackend.model.TodoItem;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {
}

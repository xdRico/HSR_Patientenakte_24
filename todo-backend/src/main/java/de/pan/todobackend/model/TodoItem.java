package de.pan.todobackend.model;

import javax.persistence.Entity;

@Entity
@Table
public class TodoItem {
    @Id
    @GeneratedValue(GenerationType.AUTO)
    private int todoItemId;
}

package com.example.todoapp.controllers;

import com.example.todoapp.dto.TodoRequestDto;
import com.example.todoapp.dto.TodoResponseDto;
import com.example.todoapp.services.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<TodoResponseDto> createUser(
            @RequestBody TodoRequestDto todoRequestDto
    ) {
        return ResponseEntity.ok(todoService.createTodo(todoRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponseDto>> getAllTodos() {
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoResponseDto> getTodoById(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoResponseDto> updateTodo(
            @PathVariable Integer id,
            @RequestBody TodoRequestDto todoRequestDto
    ) {
        return ResponseEntity.ok(todoService.updateTodo(id, todoRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(
            @PathVariable Integer id
    ) {
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}

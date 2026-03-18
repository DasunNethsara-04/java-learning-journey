package com.example.todoapp.services;

import com.example.todoapp.dto.TodoRequestDto;
import com.example.todoapp.dto.TodoResponseDto;

import java.util.List;

public interface TodoService {
    TodoResponseDto createTodo(TodoRequestDto todoRequestDto);
    List<TodoResponseDto> getAllTodos();
    TodoResponseDto getTodoById(Integer id);
    TodoResponseDto updateTodo(Integer id, TodoRequestDto dto);
    void deleteTodo(Integer id);
}

package com.example.todoapp.services.impl;

import com.example.todoapp.dto.TodoRequestDto;
import com.example.todoapp.dto.TodoResponseDto;
import com.example.todoapp.entity.Todo;
import com.example.todoapp.repository.TodoRepository;
import com.example.todoapp.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // private helper method
    private TodoResponseDto mapToDto(Todo todo) {
        TodoResponseDto dto = new TodoResponseDto();
        dto.setId(todo.getId());
        dto.setName(todo.getName());
        dto.setIsCompleted(todo.getIsCompleted());
        return dto;
    }

    @Override
    public TodoResponseDto createTodo(TodoRequestDto todoRequestDto) {
        Todo todo = new Todo();
        todo.setName(todoRequestDto.getName());
        todo.setIsCompleted(todoRequestDto.getCompleted());

        Todo saved = todoRepository.save(todo);
        return mapToDto(saved);
    }

    @Override
    public List<TodoResponseDto> getAllTodos() {
        return todoRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public TodoResponseDto getTodoById(Integer id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("User not found with id: " + id)
                );
        return mapToDto(todo);
    }

    @Override
    public TodoResponseDto updateTodo(Integer id, TodoRequestDto dto) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("User not found with id: " + id)
                );

        todo.setName(dto.getName());
        todo.setIsCompleted(dto.getCompleted());

        Todo updated = todoRepository.save(todo);
        return mapToDto(updated);
    }

    @Override
    public void deleteTodo(Integer id) {
        if (!todoRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        todoRepository.deleteById(id);
    }
}

package com.example.todoapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TodoResponseDto {
    private Integer id;
    private String name;
    private Boolean isCompleted;

    public TodoResponseDto() {
    }

    public TodoResponseDto(Integer id, String name, Boolean isCompleted, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }
}

package com.example.todoapp.dto;

import lombok.Getter;
import lombok.Setter;

public class TodoRequestDto {
    @Setter
    @Getter
    private String name;
    private Boolean isCompleted;

    public TodoRequestDto() {
    }

    public TodoRequestDto(String name, Boolean isCompleted) {
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}

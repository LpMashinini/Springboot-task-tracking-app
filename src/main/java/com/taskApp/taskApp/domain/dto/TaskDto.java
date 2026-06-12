package com.taskApp.taskApp.domain.dto;

import com.taskApp.taskApp.domain.entity.TaskPriority;
import com.taskApp.taskApp.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
)
{
}

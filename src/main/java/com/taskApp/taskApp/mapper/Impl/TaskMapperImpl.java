package com.taskApp.taskApp.mapper.Impl;

import com.taskApp.taskApp.domain.CreateTaskRequest;
import com.taskApp.taskApp.domain.dto.CreateTaskRequestDTO;
import com.taskApp.taskApp.domain.dto.TaskDto;
import com.taskApp.taskApp.domain.entity.Task;
import com.taskApp.taskApp.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDTO dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getID(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}

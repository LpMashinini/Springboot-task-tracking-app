package com.taskApp.taskApp.mapper;

import com.taskApp.taskApp.domain.CreateTaskRequest;
import com.taskApp.taskApp.domain.dto.CreateTaskRequestDTO;
import com.taskApp.taskApp.domain.dto.TaskDto;
import com.taskApp.taskApp.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDTO dto);

    TaskDto toDto(Task task);
}

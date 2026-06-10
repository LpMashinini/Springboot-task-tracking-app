package com.taskApp.taskApp.Service.impl;

import com.taskApp.taskApp.Service.TaskService;
import com.taskApp.taskApp.domain.CreateTaskRequest;
import com.taskApp.taskApp.domain.entity.Task;
import com.taskApp.taskApp.domain.entity.TaskStatus;
import com.taskApp.taskApp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                now,
                request.description(),
                request.dueDate(),
                null,
                request.priority(),
                TaskStatus.OPEN,
                request.description(),
                now

        );

       return  taskRepository.save(task);

    }
}

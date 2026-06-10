package com.taskApp.taskApp.Service;

import com.taskApp.taskApp.domain.entity.Task;
import com.taskApp.taskApp.domain.CreateTaskRequest;
public interface TaskService {

    Task createTask(CreateTaskRequest request);
}

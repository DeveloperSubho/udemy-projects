package com.example.tasks.service;


import com.example.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}

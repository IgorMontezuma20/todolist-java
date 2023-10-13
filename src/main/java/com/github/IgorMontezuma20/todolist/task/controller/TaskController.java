package com.github.IgorMontezuma20.todolist.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.IgorMontezuma20.todolist.task.model.TaskModel;
import com.github.IgorMontezuma20.todolist.task.repository.ITaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository iTaskRepository;

    @PostMapping("/")
    public ResponseEntity createTask(@RequestBody TaskModel taskModel) {
        var createdTask = this.iTaskRepository.save(taskModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }

}

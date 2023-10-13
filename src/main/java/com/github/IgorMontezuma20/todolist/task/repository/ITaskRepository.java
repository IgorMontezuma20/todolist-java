package com.github.IgorMontezuma20.todolist.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.IgorMontezuma20.todolist.task.model.TaskModel;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {

}

package com.github.IgorMontezuma20.todolist.user.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.github.IgorMontezuma20.todolist.user.model.UserModel;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {

    UserModel findByUsername(String username);
}

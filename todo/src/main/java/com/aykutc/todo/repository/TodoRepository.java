package com.aykutc.todo.repository;

import com.aykutc.todo.entity.ProgressType;
import com.aykutc.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

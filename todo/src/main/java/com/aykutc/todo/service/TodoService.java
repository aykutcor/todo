package com.aykutc.todo.service;

import com.aykutc.todo.dto.TodoDto;
import com.aykutc.todo.entity.Todo;
import com.aykutc.todo.entity.Topic;

import java.util.List;

public interface TodoService {

    List<Todo> getTodos();
}

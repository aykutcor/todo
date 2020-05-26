package com.aykutc.todo.service.impl;

import com.aykutc.todo.dto.TodoDto;
import com.aykutc.todo.entity.ProgressType;
import com.aykutc.todo.entity.Todo;
import com.aykutc.todo.entity.Topic;
import com.aykutc.todo.repository.TodoRepository;
import com.aykutc.todo.repository.TopicRepository;
import com.aykutc.todo.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;
    private final TopicRepository topicRepository;
    private final ModelMapper modelMapper;

    public TodoServiceImpl(TodoRepository todoRepository, ModelMapper modelMapper, TopicRepository topicRepository) {
        this.todoRepository = todoRepository;
        this.topicRepository = topicRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Todo> getTodos() {
        //List<Todo> t = todoRepository.findAll();
        //return Arrays.asList(modelMapper.map(t, TodoDto[].class));
        return todoRepository.findAll();
    }

    public List<Topic> getTodoByTopic() {
        return topicRepository.findAll();
    }

}

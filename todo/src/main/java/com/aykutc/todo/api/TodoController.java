package com.aykutc.todo.api;

import com.aykutc.todo.dto.TodoDto;
import com.aykutc.todo.entity.Todo;
import com.aykutc.todo.entity.Topic;
import com.aykutc.todo.service.impl.TodoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    public TodoController(TodoServiceImpl todoServiceImpl) {
        this.todoServiceImpl = todoServiceImpl;
    }

    private final TodoServiceImpl todoServiceImpl;

    @GetMapping()
    public ResponseEntity<List<Todo>> getAll() {
        List<Todo> data = todoServiceImpl.getTodos();
        return ResponseEntity.ok(data);
    }

    @GetMapping(path = "/getbytopic")
    public ResponseEntity<List<Topic>> getTodoByTopic() {
        List<Topic> data = todoServiceImpl.getTodoByTopic();
        return ResponseEntity.ok(data);
    }
    /*@GetMapping()
    public ResponseEntity<List<TodoDto>> getAll() {
        List<TodoDto> data = todoServiceImpl.getByProgressType();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable(value = "id", required = true) Long id) {
        TodoDto data = todoServiceImpl.getTodo(id);
        return ResponseEntity.ok(data);
    }*/
}

package com.aykutc.todo.dto;

import com.aykutc.todo.entity.ProgressType;
import com.aykutc.todo.entity.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {

    private Long Id;

    @NonNull
    private String todo;

    private Topic topic;
}

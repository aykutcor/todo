package com.aykutc.todo.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "todo_topic")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Topic {

    @Id
    @SequenceGenerator(name = "seq_todo_topic", sequenceName = "seq_todo_topic", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "seq_todo_topic")
    private Long id;

    @Column(name = "topic_name", length = 50)
    private String topicName;

    @OneToMany
    @JoinColumn(name = "topic_id")
    private List<Todo> todo = new ArrayList<>();

}

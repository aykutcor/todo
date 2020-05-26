package com.aykutc.todo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Todo {

    @Id
    @SequenceGenerator(name = "seq_todo", sequenceName = "seq_todo", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "seq_todo")
    private Long id;

    @Column(name = "todo", length = 50)
    private String todo;

    @ManyToOne()
    @JoinColumn(name = "topic_id")
    private Topic topic;
}

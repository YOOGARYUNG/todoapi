package com.study.todoapi.todo.dto.request;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoCheckRequestDTO {

    private String id;
    private boolean done;
}

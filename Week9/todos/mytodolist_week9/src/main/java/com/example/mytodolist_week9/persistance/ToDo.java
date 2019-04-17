package com.example.mytodolist_week9.persistance;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ToDo {

    private int id;
    private String title;
    private boolean done;
}

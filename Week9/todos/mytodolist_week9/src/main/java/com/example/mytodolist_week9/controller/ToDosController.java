package com.example.mytodolist_week9.controller;

import com.example.mytodolist_week9.communication.ToDosClient;
import com.example.mytodolist_week9.persistance.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ToDosController {

  private List<ToDo> toDos = new ArrayList<>();
  private final ToDosClient client;

  @ModelAttribute("todos")
  List<ToDo> toDos() {
    return toDos;
  }

  @ModelAttribute("todo")
  ToDo toDo() {
    return new ToDo();
  }

  @GetMapping
  String page() {
    return "todos";
  }

  @PostMapping
  String post(ToDo toDo, BindingResult result) {
    if (result.hasErrors()) {
      return page();
    }
    client.send(toDo);
    return "redirect:/";
  }

  @PostMapping("/done")
  String delete(@RequestParam int toDoId) {
    ToDo toDo = toDos.get(toDoId);
    toDo.setDone(false);
    return "redirect:/";
  }
}

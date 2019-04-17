//package com.example.mytodolist_week9.logic;
//
//import at.nacs.mypersonaltodolist.persistance.ToDo;
//import at.nacs.mypersonaltodolist.persistance.ToDoRepository;
//import com.example.mytodolist_week9.persistance.ToDo;
//import com.example.mytodolist_week9.persistance.ToDoRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class ToDoManager {
//
//    private final ToDoRepository repository;
//
//    public List<ToDo> findAll() {
//        return repository.findAll();
//    }
//
//    public ToDo save(ToDo toDo) {
//        return repository.save(toDo);
//    }
//
//    public Optional <ToDo> markAsDone(String id) {
//        Optional<ToDo> todoToUpdate = repository.findByOneId(id);
//        todoToUpdate.get().setDone(true);
//        save(todoToUpdate.orElse(null));
//        return todoToUpdate;
//    }
//
//    public void deleteBy(String id) {
//        repository.deleteToDoByIdID(id);
//    }
//}

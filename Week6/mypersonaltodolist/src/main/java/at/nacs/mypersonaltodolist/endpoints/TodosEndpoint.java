package at.nacs.mypersonaltodolist.endpoints;

import at.nacs.mypersonaltodolist.logic.ToDoManager;
import at.nacs.mypersonaltodolist.persistance.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodosEndpoint {

    private final ToDoManager toDoManager;

    @GetMapping
    public List<ToDo> get () {
        return toDoManager.findAll();
    }

    @PostMapping
    public ToDo receiveNewToDo (@RequestBody ToDo toDo) {
        return toDoManager.save(toDo);
    }

    @PutMapping
    public ToDo update(@PathVariable String id) {
        ToDo toDo = toDoManager.markAsDone(id).orElse(null);
        return toDoManager.save(toDo);
    }

    @DeleteMapping
    public void delete(@PathVariable String id) {
        toDoManager.deleteBy(id);
    }
}

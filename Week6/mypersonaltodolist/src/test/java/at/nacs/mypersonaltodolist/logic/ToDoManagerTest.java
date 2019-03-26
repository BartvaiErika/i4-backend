package at.nacs.mypersonaltodolist.logic;

import at.nacs.mypersonaltodolist.persistance.ToDo;
import at.nacs.mypersonaltodolist.persistance.ToDoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ConfigurationProperties("dataset")
class ToDoManagerTest {

    @Autowired
    ToDoManager toDoManager;

    @Autowired
    ToDoRepository repository;

    ToDo todo;

    @BeforeEach
    void before() {
        repository.deleteAll();
        todo = new ToDo();
        todo.setTitle("Test todo");
    }

    @Test
    void findAll() {
        List<ToDo> actual = toDoManager.findAll();
        assertThat(actual).isEmpty();
    }

    @Test
    void save() {
        ToDo actual = toDoManager.save(todo);
        assertThat(actual.getId()).isNotBlank();
        assertThat(actual.getTitle()).isEqualTo(todo.getTitle());
    }

    @Test
    void markAsDone(String id) {
        Optional<ToDo> actual = repository.findByOneId(id);
        actual.get().setDone(true);
        save();
        //save(actual.orElse(null));
        assertThat(actual.get().isDone());
    }

    @Test
    void deleteBy(String id) {
        repository.deleteToDoByIdID(id);
        assertThat(repository.findByOneId(id).isEmpty());
    }
}
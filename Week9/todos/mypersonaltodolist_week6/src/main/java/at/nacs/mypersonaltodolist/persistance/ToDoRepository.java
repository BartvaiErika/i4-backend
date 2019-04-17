package at.nacs.mypersonaltodolist.persistance;

import at.nacs.mypersonaltodolist.persistance.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

   List<ToDo> findAll();
   Optional<ToDo> deleteToDoByIdID(String id);
   Optional<ToDo> findByOneId(String id);

}

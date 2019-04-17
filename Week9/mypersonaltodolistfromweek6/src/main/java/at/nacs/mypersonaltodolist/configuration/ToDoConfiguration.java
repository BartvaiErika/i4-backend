package at.nacs.mypersonaltodolist.configuration;

import at.nacs.mypersonaltodolist.persistance.ToDo;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@Configuration
@ConfigurationProperties("dataset")
public class ToDoConfiguration {
    @Setter
    private List<ToDo> todos;

    @Bean
    List<ToDo> todos() {return todos; }
}

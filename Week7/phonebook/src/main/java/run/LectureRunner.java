package run;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import persistence.CellPhone;
import persistence.Person;
import persistence.PersonRepository;

@Configuration
public class LectureRunner {
@Bean
    ApplicationRunner  runner (PersonRepository repository) {
        return args -> {
            Person person = new Person();
            person.setName("Max");
            repository.save(person);

            CellPhone workingCellPhone = new CellPhone();
            workingCellPhone.setNumber("12345");

            CellPhone privateCellPhone = new CellPhone();
            privateCellPhone.setNumber("56789");
        };
    }
}

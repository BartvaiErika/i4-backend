package persistence;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Skill {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}

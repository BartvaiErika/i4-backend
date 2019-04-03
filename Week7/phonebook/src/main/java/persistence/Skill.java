package persistence;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Skill {
    @Id
    @GeneratedValue

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Long id;
    @ManyToMany(cascade = CascadeType.ALL)
    private String name;
}

package persistence;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany(cascade = CascadeType.ALL)
    private String name;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private CellPhone privatcellphone;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private CellPhone workingcellphone;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cloth> clothes = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Skill> skills = new ArrayList<>();

}

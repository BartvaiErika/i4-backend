package domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique=true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Address asdress;
}

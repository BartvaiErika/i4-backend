package persistence;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cloth {
    @Id
    @GeneratedValue
    private long id;

    @Id
    @GeneratedValue
    private String name;
}

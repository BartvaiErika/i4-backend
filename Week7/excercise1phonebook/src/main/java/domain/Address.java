package domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;

    private String name;

}

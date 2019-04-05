package persistence;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class CellPhone {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String number;
}
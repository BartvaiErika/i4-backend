package domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Entity
public class Kind {
    @Enumerated(EnumType.STRING)    //TREATMENT, MEDICINE
    private Enum provided;
}

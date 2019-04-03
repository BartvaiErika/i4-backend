import persistence.CellPhone.CellPhone;
import persistence.CellPhone.Cloth.Cloth;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToOne
    private CellPhone privatcellphone;
    @OneToOne
    private CelPhone workingcellphone;
    @OneToMany
    private List<Cloth> cloth = new ArrayList<>();
}

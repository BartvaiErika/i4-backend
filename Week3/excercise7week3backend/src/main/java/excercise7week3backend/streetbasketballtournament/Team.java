package excercise7week3backend.streetbasketballtournament;
import lombok.Data;
import java.util.List;

@Data
public class Team {

    private String name;
    private List<String> players;
}
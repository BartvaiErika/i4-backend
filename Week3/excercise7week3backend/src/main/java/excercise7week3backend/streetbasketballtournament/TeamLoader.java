package excercise7week3backend.streetbasketballtournament;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
@ConfigurationProperties("stadion")
@Getter
@Setter
public class TeamLoader {

    private LinkedList<Team> team;
}
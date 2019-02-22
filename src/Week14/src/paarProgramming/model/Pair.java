package paarProgramming.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Pair {

    protected List<Participant> participants;

}
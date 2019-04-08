package excercise8rockscissorspaper.logic;

import excercise8rockscissorspaper.domain.Move;
import lombok.RequiredArgsConstructor;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class Moves {

    private final Set<Move> moves;

    public String asString() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
    }

    public Optional<Move> from(String name) {
        return moves.stream()
                .filter(e -> Objects.equals(e.getName(), name))
                .findFirst();
    }

}
package pokemonlive.persistence;
import org.springframework.data.mongodb.repository.MongoRepository;
import pokemonlive.persistence.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends MongoRepository<Pokemon, String> {
    Optional<Pokemon> findOneByName(String name);

    List<Pokemon> findByType(String type);

    List<Pokemon> findBySubtype(String subtype);
}

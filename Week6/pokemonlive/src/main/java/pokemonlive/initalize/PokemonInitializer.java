package pokemonlive.initalize;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import pokemonlive.file.PokemonReader;
import pokemonlive.persistence.PokemonRepository;

//@Configuration
public class PokemonInitializer {

    @Bean
    ApplicationRunner initialize(PokemonRepository repository, PokemonReader reader) {
        return args -> reader.readPokemons()
                .forEach(repository::save);
    }
}


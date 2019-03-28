import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pokemonlive.persistence.Pokemon;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class PokemonConfiguration {

    @Setter
    List<Pokemon> pokemons;

    @Setter
    @Getter
    Pokemon pokemon;

    @Bean
    List<Pokemon> pokemons() {
        return pokemons;
    }

    @Bean
    Pokemon pokemon() {
        return pokemon;
    }
}


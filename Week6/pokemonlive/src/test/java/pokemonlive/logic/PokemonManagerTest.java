package pokemonlive.logic;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pokemonlive.persistence.Pokemon;
import pokemonlive.persistence.PokemonRepository;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class PokemonManagerTest {

    @Autowired
    Pokemon pokemon;

    @Autowired
    List<Pokemon> pokemons;

    @Autowired
    PokemonManager manager;

    @Autowired
    PokemonRepository repository;

    @BeforeEach
    void setUp() {
        repository.deleteAll();
        repository.saveAll(pokemons);
    }

    @Test
    void findAll() {
        List<Pokemon> actual = manager.findAll();
        assertThat(actual.size()).isEqualTo(3);
    }

    @Test
    void findByName() {
        Optional<Pokemon> actual = manager.findByName(pokemon.getName());
        assertThat(actual.get().getId()).isNotBlank();
        assertThat(actual.get().getName()).isEqualTo(pokemon.getName());
    }

    @Test
    void findByType() {

    }

    @Test
    void findBySubtype() {
    }
}

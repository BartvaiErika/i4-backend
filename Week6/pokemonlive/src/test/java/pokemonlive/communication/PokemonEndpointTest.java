package pokemonlive.communication;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import pokemonlive.logic.PokemonManager;
import pokemonlive.persistence.Pokemon;
import pokemonlive.persistence.PokemonRepository;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PokemonEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    PokemonRepository repository;

    @SpyBean
    PokemonManager manager;

    @Test
    void getAll() {
        String url = "/pokemons";
        restTemplate.getForObject(url, Pokemon[].class);
        verify(manager).findAll();
    }

    @Test
    void getByName() {
        String url = "/pokemons/name/Omar";
        restTemplate.getForObject(url, Pokemon.class);
        verify(manager).findByName(anyString());
    }

    @Test
    void getByType() {
        String url = "/pokemons/type/Awesome";
        restTemplate.getForObject(url, Pokemon[].class);
        verify(manager).findByType(anyString());
    }

    @Test
    void getBySubtype() {
        String url = "/pokemons/subtype/Awesomer";
        restTemplate.getForObject(url, Pokemon[].class);
        verify(manager).findBySubtype(anyString());
    }
}
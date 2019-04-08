package week5programming.excercise4week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
//    Create the SuperheroCaller class that has a list with the three superheroes.
//    It has the call method that returns a random Superhero every time you use it.
    public List<Superhero> superheroes;

    public SuperheroCaller(List<Superhero> superheroes) {
        this.superheroes = superheroes;
    }

    public List<Superhero> getSuperheroes() {
        return superheroes;
    }

    public Superhero call (List<Superhero> superheroes){

        Random random = new Random() ;
        return superheroes.get(random.nextInt(superheroes.size()));
    }
}

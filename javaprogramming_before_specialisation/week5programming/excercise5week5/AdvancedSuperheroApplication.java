package week5programming.excercise5week5;

import week5programming.excercise4week5.SuperheroCaller;
import week5programming.excercise4week5.Superhero;

import java.util.ArrayList;
import java.util.List;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {

        List<Superhero> superheroes = new ArrayList<>();
        SuperheroCaller superheroCaller = new SuperheroCaller(superheroes);
        Joker joker = new Joker();
        for (int i = 0; i < 10; i++) {
            Superhero superhero = superheroCaller.call(superheroes);
            joker.weaken(superhero.getName());
        }


//Required results:
//Damn you, Spiderman! You managed to weaken me!
//Damn you, Batman! You managed to weaken me!
//Damn you, Spiderman! You managed to weaken me!
//Damn you, Spiderman! You managed to weaken me!
//Damn you, Batman! You managed to weaken me!
//Damn you, Batman! You managed to weaken me!
//Damn you, Batman! You managed to weaken me!
//Damn you, Spiderman! You managed to weaken me!
//Damn you, Batman! You managed to weaken me!
//Damn you, Spiderman! You managed to weaken me!
//You all defeated me! But I will be back!

    }
}

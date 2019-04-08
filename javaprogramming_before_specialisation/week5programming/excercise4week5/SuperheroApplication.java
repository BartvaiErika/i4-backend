package week5programming.excercise4week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
        Superhero spiderman =  new Spiderman();
        Superhero superman = new Spiderman();
        Superhero batman = new Batman();
        List<Superhero> superheroes = new ArrayList<Superhero>();
        superheroes.add(spiderman);
        superheroes.add(superman);
        superheroes.add(batman);
//      Create a SuperheroCaller and use it to call one superhero. Display its name.
        SuperheroCaller superheroCaller = new SuperheroCaller(superheroes) ;
        System.out.println("Superhero: " + (superheroCaller.call(superheroes)).getName());
        for (int i = 1; i < 7; i++) {
            superheroes.add(superheroCaller.call(superheroes));
        }
        Integer counter = 0;
        for (Superhero superhero:superheroes) {
            System.out.println("Superhero " + counter + ": " + superhero.getName());
            counter++;
        }
        System.out.println("Number of superheroes: " + counter);
//        Create a list of Superhero and add six superheroes by calling them with the SuperheroCaller.
//        Use a lop for this, please.
//         Display the superheroe names one by one with a loop by also showing the number of appearance.
//        Display the number of superheroes by using the list’s size.


//        Superhero: Superman
//        Superhero 1: Batman
//        Superhero 2: Batman
//        Superhero 3: Batman
//        Superhero 4: Spiderman
//        Superhero 5: Batman
//        Superhero 6: Spiderman
//        Number of superheroes: 6

    }
}

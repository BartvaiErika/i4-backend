package week5programming.excercise4week5;

import week5programming.excercise5week5.Villain;

public class Spiderman implements Superhero {
    @Override
    public String getName() {
        return "Spiderman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }

    //Update the Batman, Superman and Spiderman
    // classes from exercise 4 with the fight method. Inside it, it weakens the villain.

    @Override
    public String toString() {
        return "spiderman";
    }
}

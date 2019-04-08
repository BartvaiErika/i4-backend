package week5programming.excercise4week5;

import week5programming.excercise5week5.Villain;

public class Batman implements Superhero {
    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "batman";
    }
}

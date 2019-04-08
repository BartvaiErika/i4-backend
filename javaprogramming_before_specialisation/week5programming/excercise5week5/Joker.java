package week5programming.excercise5week5;

public class Joker implements Villain {

//Create the Joker class that implements Villain.
//It has the lives attribute that starts with the value ten.
//In its weaken method, display the message “Damn you, <Superhero’s name>!
//You managed to weaken me!” and subtract one from his lives counter.
//If his lives reaches zero, he displays the message “You all defeated me! But I will be back!”.
    @Override
    public void weaken(String name) {

        Integer lives=10;
        System.out.println("Damn you, " + name + "! You managed to weaken me!");
        lives--;
        if (lives.equals(0)) System.out.println("You all defeated me! But I will be back!");
        }

}



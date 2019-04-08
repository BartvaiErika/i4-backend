package week5programming.excercise2week5;

import week5programming.excercise1week5.Shape;

public class Triangle implements Shape {

//    Create the Triangle class that implements the Shape interface.
//    Implement the getName method with the help of Intellij.
//    Return the word triangle in that method. Reuse the Shape interface from exercise 1.

    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return "triangle";
    }
}

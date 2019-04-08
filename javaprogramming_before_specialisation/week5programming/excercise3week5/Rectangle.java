package week5programming.excercise3week5;

import week5programming.excercise1week5.Shape;
//Add the Shape interface to the Rectangle class. Don’t replace Colored.
// Just place a comma after Colored and add Shape right afterwards.
// Implement the getName method with the help of Intellij.

public class Rectangle implements Colored, Shape {
    public String getColor() {
        return "violet";
    }
    @Override
    public String getName() {
        return "rectangle";
    }
    //Add the toString method to the Rectangle.

    @Override
    public String toString() {
        return "violet" + " " + "rectangle";
    }

}

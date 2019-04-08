package week5programming.excercise2week5;

import week5programming.excercise1week5.Circle;
import week5programming.excercise1week5.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {

// Create a Circle as a Shape, name it circle and display its name.
        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());

//Create a Square as a Shape, name it square and display its name.
        Shape square = new Square();
        System.out.println("Shape: " + square.getName());

//Create a Triangle as a Shape, name it triangle and display its name.
        Shape triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());

//Create a list of Circle named circles and try to add circle, square and triangle to it.

//        List<Circle> circles = Arrays.asList(circle);
// It doesn’t work because circle is not a Circle now,

// it is a Shape, and it’s not the same.
// Also, square and triangle don’t work either because they are not Circles.
//Create a list of Shape named shapes and add circle to it.
        List<Shape> shapes = Arrays.asList(circle, square, triangle);

//Try to add square and triangle as well. It works because the three of them are shapes.
//Display the list. It shows memory addresses.

        for (Shape shape : shapes) {
           System.out.printf(shape.getName()+" ");
        }

//Implement the toString methods in each one of the three Shapes
//returning the name of the shape itself by reusing the interface method. Display it now.
//Use a foreach loop to go through all the shapes and one by one display its names.
        System.out.println();
        for (Shape shape : shapes) {
            System.out.println("Shape name: "+ shape.toString());
        }

//        Shape: circle
//        Shape: square
//        Shape: triangle
//        Shapes: [circle, square, triangle]
//        Shape name: circle
//        Shape name: square
//        Shape name: triangle


    }
}

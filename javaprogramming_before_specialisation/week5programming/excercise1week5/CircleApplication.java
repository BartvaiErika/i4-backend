package week5programming.excercise1week5;

public class CircleApplication {
    public static void main(String[] args) {

//        Create a Circle and display its name.
//                In a new line, assign the circle variable to a Shape variable called shape. Just use the = symbol.
//                Display the shape’s name.
//        Create another Circle, but this time assign it directly to a Shape with the name anotherShape.
//                Display anotherShape’s name.
//

        Circle cirkle = new Circle();
        System.out.println("Class: " + cirkle.getName());
        Shape shape = new Circle();
        System.out.println("Shape: " + shape.getName());
        Circle anotherShape = new Circle();
        System.out.println("Another shape: " + anotherShape.getName());

    }
}

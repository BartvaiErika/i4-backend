package week9programming.heroesGuestBoard;

public class Triangle {

    public int height;
    public int base;
    private double area;

    public void setArea(double a) {
        area = a;
    }
    public double getArea() {
        return area;
    }
}

//    Write a function that sets the area of the given Triangle and returns the area as a double.
//    Do not use the function type Function<T,R>; there is a function type
//    for converting an arbitrary class into a double, use that.
//    The formula for triangle area is: 1/2 * base * height
//    Assume valid input (base and height are both greater than 0).
//    A full listing of the default function types can be found at http:
//    //docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
//Created by Erika
package week3programming.reflection2new;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        Integer number = 123456789;
        NumberMirror numberMirror = new NumberMirror();
        System.out.println("Backwardsnumber is: "+ numberMirror.mirror(number));
    }
}


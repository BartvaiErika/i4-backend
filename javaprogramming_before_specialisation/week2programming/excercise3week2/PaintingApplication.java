//Created by Erika
package week2programming.excercise3week2;

public class PaintingApplication {
    public static void main(String[] args) {
        Derek derek = new Derek();
        derek.hangPainting();

        Tool hammer = new Tool("Hammer");
        derek.setTool(hammer);
        derek.hangPainting();
    }
}

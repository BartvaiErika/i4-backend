package week5programming.excercise6week5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {

    private Step back = new AddBack();
    private Step bottom = new AddBottom();
    private Step door = new AddDoor();
    private Step shelf = new AddShelf();
    private Step side = new AddSide();
    private Step top = new AddTop();

    List <Step> steps = Arrays.asList(back, side, side, back, top, shelf, shelf,
                shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door);

     public Wardrobe build() {
         Wardrobe wardrobe = new Wardrobe();
         for (Step step: steps) {
             step.perform(wardrobe);
        }
         return wardrobe;
    }
}

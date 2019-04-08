package week5programming.reflectionweek5;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}

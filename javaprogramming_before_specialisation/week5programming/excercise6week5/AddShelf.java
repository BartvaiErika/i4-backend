package week5programming.excercise6week5;

public class AddShelf implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}

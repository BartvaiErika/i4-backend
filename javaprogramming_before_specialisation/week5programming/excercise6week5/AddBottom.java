package week5programming.excercise6week5;

public class AddBottom implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}

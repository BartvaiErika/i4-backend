package week5programming.excercise6week5;

public class AddBack implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("back");
    }

}

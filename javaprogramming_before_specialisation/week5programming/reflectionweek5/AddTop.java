package week5programming.reflectionweek5;

public class AddTop implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("top");
    }
}

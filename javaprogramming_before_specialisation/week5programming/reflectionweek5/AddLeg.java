package week5programming.reflectionweek5;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }

}

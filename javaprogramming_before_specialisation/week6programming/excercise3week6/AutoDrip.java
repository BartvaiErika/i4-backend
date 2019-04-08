package week6programming.excercise3week6;

public class AutoDrip extends CoffeeMaker {

    @Override
    protected String getName() {
        return "Auto drip";
    }

    @Override
    protected Integer getBrewingTime() {
        return 6;
    }

//    public Coffee brew() {
//        Coffee coffee = new Coffee(getName(),getBrewingTime());
//        return coffee;
//    }

}

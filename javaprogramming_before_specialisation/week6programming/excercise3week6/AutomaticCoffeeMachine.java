package week6programming.excercise3week6;

public class AutomaticCoffeeMachine extends CoffeeMaker {

    @Override
    protected String getName() {
        return "Automatic coffee machine";
    }

    @Override
    protected Integer getBrewingTime() {
        return 5;
    }

//    public Coffee brew() {
//        Coffee coffee = new Coffee(getName(),getBrewingTime());
//        return coffee;
//    }
}

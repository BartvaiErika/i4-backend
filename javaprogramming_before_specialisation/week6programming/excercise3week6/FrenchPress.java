package week6programming.excercise3week6;

public class FrenchPress extends CoffeeMaker {

    @Override
    protected  String getName() {
        return "French press";
    }

    @Override
    protected Integer getBrewingTime() {
        return 10;
    }

//    public Coffee brew() {
//        Coffee coffee = new Coffee(getName(),getBrewingTime());
//        return coffee;
//    }

}

package week6programming.excercise3week6;

public abstract class CoffeeMaker {

    public CoffeeMaker() {
    }

    protected abstract String getName();
    protected abstract Integer getBrewingTime();

    public Coffee brew() {
        String madeby = getName();
        Integer brewingTime = getBrewingTime();
        return new Coffee(madeby,brewingTime);
    }

}
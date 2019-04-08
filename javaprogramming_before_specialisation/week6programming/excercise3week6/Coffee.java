package week6programming.excercise3week6;

public class Coffee {
// Create the Coffee class. It has the madeBy String attribute
// and the brewedTime Integer attribute. They are provided via constructor.
// It has the getMadeBy and getBrewedTime methods.
    private String madeBy;
    private Integer brewedTime;

    public Coffee(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public Integer getBrewedTime() {
        return brewedTime;
    }

}

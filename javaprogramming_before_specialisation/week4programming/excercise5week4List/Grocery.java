package week4programming.excercise5week4List;

public class Grocery {
    private String name;

    public Grocery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }

    public Boolean equals (Grocery grocery) {
        return this.name.equals(grocery.getName());
    }

}

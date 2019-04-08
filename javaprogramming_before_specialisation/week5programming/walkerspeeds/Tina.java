package week5programming.walkerspeeds;

public class Tina implements Hiker {

    @Override
    public void hike() {
        System.out.println("Tina: I want to walk.");
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I got there!");
    }

}
package week5programming.walkerspeeds;

public class Tamara implements Hiker {
    @Override
    public void hike() {
        System.out.println("Tamara: I'm the fastest!");
        try {
            Thread.sleep(1* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I was there already!)");
    }
}
package week8programming;

public class SensorRobomimeApplication {
    public static void main(String[] args) {

        Decriptor decriptor  = new Decriptor();
        decriptor .getTrickes();
        System.out.println("Number of unique tricks: " + decriptor .trickes.size());
        System.out.println("Tricks: " + decriptor.trickes);
    }


}

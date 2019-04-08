package week2programming.Reflection2Erika;

public class PostOfficeAssistant {
    public void stamp(Letter letter) {
        letter.stamp();
    }

    public void send(Letter letter) {
        if (letter.isStamped()) {
            System.out.println("I will send it to: " + letter.getAddress());
        } else {
            System.out.println("You have to stamp it first.");
        }
    }
}

package Week8.LSolutions.robomime;

import java.util.List;

public class RobomimeApplication {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        List<String> tricks = sensor.scan();

        Archive archive = new Archive();
        archive.displayUniqueTricks(tricks);
    }

}
package Week8.LSolutions.robomime;

import java.util.List;

public class Sensor {

    private FileReader reader = new FileReader();
    private Decryptor decryptor = new Decryptor();

    public List<String> scan() {
        List<String> lines = reader.getLines("Week8/LSolutions/robomime/robomime.txt");
        return decryptor.decrypt(lines);
    }

}
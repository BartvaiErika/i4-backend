package week7programming.excercise7week7;

public class Transporter {

    public Boolean canTransport (Integer vehicleType1, Integer vehicleType2, Integer numberOfCelebrities) {
            Integer restType2 = numberOfCelebrities % 5;
            Integer demandType2 = numberOfCelebrities/5;
            Integer demandType1 = vehicleType1-restType2;
            if (demandType2 > vehicleType2)
                demandType1 = demandType1+demandType2-vehicleType2;
            if ((demandType2 <= vehicleType2) && (demandType1 >= 0))
                return true;
            else return false;
    }
}

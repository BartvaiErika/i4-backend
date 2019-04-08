package week5programming.travelingspeeds;
import java.util.List;

public class TransportSpeedApplication {

        public static void main(String[] args) {
            TransportationCompany  factory = new TransportationCompany();
            List<Transportation> transportations = factory.getTransportations();
            for (Transportation transportation: transportations) {
                transportation.travel();
            }
        }
}

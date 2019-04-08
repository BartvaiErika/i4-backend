package week5programming.travelingspeeds;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

        public class TransportationCompany {

        public List<Transportation> getTransportations() {
            return Stream.of(new Ship(), new Car(), new Bycicle()).collect(Collectors.toList());
        }

}

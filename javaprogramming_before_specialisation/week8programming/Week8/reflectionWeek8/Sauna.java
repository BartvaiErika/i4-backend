//package Week8.reflectionWeek8;
//
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//public class Sauna extends Thermostat{
//
//    public Sauna(Predicate<Double> condition, Function<Double,String> display) {
//        super(condition, display);
//    }
//
//    @Override
//    public String sense(Double temperature) {
//        String message = getDisplay().apply(temperature);
//        if(getCondition().test(temperature)){
//            message= "Warning!";
//        }
//        return message;
//    }
//}

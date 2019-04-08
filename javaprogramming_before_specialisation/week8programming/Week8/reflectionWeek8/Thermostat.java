//package Week8.reflectionWeek8;
//import java.util.function.Predicate;
//
//import java.util.function.Function;
//
//public class abstract Thermostat {
//    private Predicate<Double> condition;
//    private Function<Double,String> display;
//
//    public Thermostat(Predicate<Double> condition, Function<Double,String> display) {
//        this.condition = condition;
//        this.display = display;
//    }
//
//    public Predicate<Double> getCondition() {
//        return condition;
//    }
//
//    public Function<Double, String> getDisplay() {
//        return display;
//    }
//
//    public abstract String sense(Double temperature);
//}

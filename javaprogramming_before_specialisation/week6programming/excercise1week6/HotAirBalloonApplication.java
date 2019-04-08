package week6programming.excercise1week6;

public class HotAirBalloonApplication {
    public static void main(String[] args) {

        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();

        System.out.println("smallBalloon --");
        smallBalloon.liftUp();
        smallBalloon.land();
        System.out.println("bigBalloon --");
        bigBalloon.liftUp();
        smallBalloon.land();

        HotAirBalloon smallBallon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallBallon.liftUp();
        smallBallon.land();
        HotAirBalloon bigBallon = new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigBallon.liftUp();
        bigBallon.land();


    }

//      Output:
//    smallBalloon --
//    The balloon lifts up
//    The balloon lands
//    bigBalloon --
//    The balloon lifts up
//    The balloon lands
//    small --
//    The balloon lifts up
//    The balloon lands
//    big --
//    The balloon lifts up
//    The balloon lands

}

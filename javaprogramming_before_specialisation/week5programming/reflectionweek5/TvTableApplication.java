package week5programming.reflectionweek5;

public class TvTableApplication {

    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = tvTableBuilder.build();
        System.out.println(tvTable);
    }
}

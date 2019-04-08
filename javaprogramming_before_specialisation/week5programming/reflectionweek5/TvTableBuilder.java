package week5programming.reflectionweek5;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    private Step leg = new AddLeg();
    private Step shelf = new AddShelf();
    private Step top = new AddTop();

    List <Step> steps = Arrays.asList(new AddLeg(), new AddLeg(), new AddLeg(),
    new AddLeg(), new AddShelf(), new AddTop());

    public TvTable build() {

        TvTable tvTable = new TvTable();
        for (Step step: steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }
}

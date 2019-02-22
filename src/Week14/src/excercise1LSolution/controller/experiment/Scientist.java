package excercise1LSolution.controller.experiment;

import excercise1LSolution.controller.statistic.Statistics;
import excercise1LSolution.model.Bean;
import excercise1LSolution.model.Statistic;
import lombok.experimental.UtilityClass;

import java.util.Queue;

@UtilityClass
public class Scientist {

    public Statistic gatherExperimentStatistic(Queue<Bean> beans) {
        Statistic statistic = Statistics.prepareStatistic(beans);
        Bean lastBean = Experiment.perform(beans);
        statistic.setColorOfLastBean(lastBean.getColor());
        return statistic;
    }
}
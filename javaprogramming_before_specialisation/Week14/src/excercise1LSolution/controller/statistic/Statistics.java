package excercise1LSolution.controller.statistic;

import excercise1LSolution.controller.bean.Beans;
import excercise1LSolution.model.Bean;
import excercise1LSolution.model.Statistic;
import lombok.experimental.UtilityClass;

import java.util.Objects;
import java.util.Queue;

@UtilityClass
public class Statistics {

    public Statistic prepareStatistic(Queue<Bean> beans) {
        long whiteBeans = count(beans, Beans.getWhite());
        long blackBeans = count(beans, Beans.getBlack());
        double totalBeans = beans.size();
        return Statistic.builder()
                .numberOfWhiteBeans(whiteBeans)
                .numberOfBlackBeans(blackBeans)
                .percentageOfWhiteBeans(Percentages.calculate(whiteBeans, totalBeans))
                .percentageOfBlackBeans(Percentages.calculate(blackBeans, totalBeans))
                .build();
    }

    private long count(Queue<Bean> beans, Bean expected) {
        return beans.stream()
                .filter(bean -> Objects.equals(expected, bean))
                .count();
    }
}

package excercise1LSolution.controller.experiment.refill;

import excercise1LSolution.controller.bean.Beans;
import excercise1LSolution.model.Bean;

import java.util.Objects;
import java.util.Optional;

public class Equals extends RefillStrategy {

    @Override
    boolean isValid(Bean bean1, Bean bean2) {
        return Objects.equals(bean1, bean2);
    }

    @Override
    Optional<Bean> getBean() {
        return Optional.of(Beans.getBlack());
    }
}
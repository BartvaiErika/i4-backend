package excercise1LSolution.controller.experiment.refill;

import excercise1LSolution.model.Bean;
import java.util.Optional;

public abstract class RefillStrategy {

    public Optional<Bean> get(Bean bean1, Bean bean2) {
        if (!isValid(bean1, bean2)) {
            return Optional.empty();
        }
        return getBean();
    }

    abstract boolean isValid(Bean bean1, Bean bean2);

    abstract Optional<Bean> getBean();


}

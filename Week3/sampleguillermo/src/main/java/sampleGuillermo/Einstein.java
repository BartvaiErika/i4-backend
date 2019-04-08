package sampleGuillermo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Einstein {

    @Getter
    @Value("${formulas.energy}")
    private String formula;
}

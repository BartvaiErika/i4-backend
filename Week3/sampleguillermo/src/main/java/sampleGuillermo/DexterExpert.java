package sampleGuillermo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("tvshow")
@Getter
@Setter
public class DexterExpert {


    private String name;
    private int seasons;
    private double rating;

}
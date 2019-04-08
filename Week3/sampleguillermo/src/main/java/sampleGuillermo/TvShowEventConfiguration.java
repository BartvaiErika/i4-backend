package sampleGuillermo;

import fundamentals2.DexterExpert;
import fundamentals2.TvShowEvent;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TvShowEventConfiguration {

    @Bean
    ApplicationRunner application(TvShowEvent event) {
        return args -> {
            List<String> tvshows = event.getTvshows();
            System.out.println(tvshows);
        };
    }

    @Bean
    ApplicationRunner application2(DexterExpert expert) {
        return args -> {
            System.out.println(expert.getName());
            System.out.println(expert.getSeasons());
            System.out.println(expert.getRating());
        };
    }

}
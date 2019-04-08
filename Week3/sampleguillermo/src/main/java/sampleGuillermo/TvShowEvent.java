package sampleGuillermo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class TvShowEvent {
@Getter
@Value("${event.tvshows}")
private List<String> tvshows;
}



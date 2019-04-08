package week4marathon;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class RunnerRepositoryTest {

    @Autowired
    RunnerRepository runnerRepository;

    @Test
    public void add() {
    }

    @Test
    public void findAll() {
        List<Runner> actualRunners = runnerRepository.findAll();
        assertThat(actualRunners).isNotEmpty();
    }

    @Test
    public void findFastest() {
        Optional<Runner> fastestRunner = runnerRepository.findFastest();
    }
}
//
//@SpringBootTest(webEnvironment = RANDOM_PORT)
//class MarathonIntegrationTest {
//
//    @Autowired
//    Marathon marathon;
//
//    @Test
//    void run() {
//        Summary summary = marathon.run();
//
//        assertThat(summary).isNotNull();
//        assertThat(summary.getResult()).isEqualTo("SUCCESS");
//    }
}
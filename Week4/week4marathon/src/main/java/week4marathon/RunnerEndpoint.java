package week4marathon;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/runners")
public class RunnerEndpoint {

        private final RunnerRepository runnerRepository;

        @GetMapping
        List<Runner> runners() {
            return runnerRepository.findAll();
        }

        @PostMapping
        Runner add(@RequestBody Runner runner) {
            runnerRepository.add(runner);
            return runner;
        }

    }
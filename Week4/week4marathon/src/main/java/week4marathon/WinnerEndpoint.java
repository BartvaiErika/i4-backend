package week4marathon;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

//@RestController
//@RequestMapping("/winner")
//@RequiredArgsConstructor
//public class WinnerEndpoint {
////    GET to /winner -> returns the winner
//
//    private final Set<Runner> runners;
//
//
//    @GetMapping
//    Optional <Runner> getWinner() {
//        return runners.stream()
//                .min(Comparator.comparing(Runner::getTime));
//    }
//
//}


import java.util.Optional;

@RestController
@RequestMapping("/winner")
@RequiredArgsConstructor
public class WinnerEndpoint {

    private final RunnerRepository runnerRepository;

    @GetMapping
    Optional<Runner> getWinner() {
        return runnerRepository.findFastest();
    }
}
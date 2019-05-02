package wonderland.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wonderland.logic.WonderlandNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class collectingLongWondernumbersTest {

  private WonderlandNumberGenerator generator = new WonderlandNumberGenerator();

  private Set<Long> actualwonderlandNumbers = new HashSet<>();
  private Set<Integer> actualwonderNumbers = new HashSet<>();

  @Test
  void collectingLongWondernumbers() {
    actualwonderlandNumbers = generator.collectingLongWondernumbers();
    Assertions.assertTrue(actualwonderlandNumbers.size()==24);
  }
}

package wonderland.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wonderland.logic.WonderlandNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class PermutTest {

  private WonderlandNumberGenerator generator = new WonderlandNumberGenerator();
  private Set<Integer> actualwonderNumbers = new HashSet<>();

  @Test
  void permut() {
    actualwonderNumbers = generator.permut();
    Integer actualFirst = actualwonderNumbers.iterator().next();
    Assertions.assertSame(actualFirst,1);
    Integer actualSize = actualwonderNumbers.size();
    Assertions.assertSame(actualSize ,6);
  }

}

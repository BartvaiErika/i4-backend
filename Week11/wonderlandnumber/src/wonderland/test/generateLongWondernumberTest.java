package wonderland.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wonderland.logic.WonderlandNumberGenerator;

public class generateLongWondernumberTest {

  private WonderlandNumberGenerator generator = new WonderlandNumberGenerator();

  private Long actualwonderlandNumber;

  @Test
  void generateLongWondernumber() {
    actualwonderlandNumber = generator.generateLongWondernumber();
    Assertions.assertNotEquals(100007, actualwonderlandNumber);
    Assertions.assertTrue(actualwonderlandNumber>=100007);
    Assertions.assertTrue(actualwonderlandNumber<=185427);
  }

}

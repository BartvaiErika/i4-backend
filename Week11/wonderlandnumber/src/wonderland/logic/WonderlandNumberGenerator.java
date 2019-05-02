package wonderland.logic;

import java.util.*;
import java.util.stream.Collectors;

public class WonderlandNumberGenerator{

  private int length = 5;
  private int[] digits = {2, 4, 5, 8};
  private long wonderlandNumber;
  private Set<Long> wonderlandNumbers = new HashSet<>();
  private Set<Integer> wonderNumbers = new HashSet<>();

  private void integrate(int i){
      wonderNumbers.add(digits[i]);
  }

  private void swap (int[] numbers, int i, int j) {
      int tray = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = tray;
  }

  public Set<Integer> permut() {
      wonderNumbers.add(1);
      int maxLength = 4;
      for (int i = 0; i < maxLength; i++) {
          swap(digits, i, maxLength);
          permut();
          swap(digits, i, maxLength);
          integrate(digits[i]);
      }
      wonderNumbers.add(7);
      return wonderNumbers;
  }

  public Long generateLongWondernumber() {
    wonderNumbers = permut();
    wonderNumbers.stream().forEach(i->i.longValue());

    return Long.valueOf(wonderNumbers.stream()
           .map(String::valueOf)
           .collect(Collectors.joining()));
  }

  public Set<Long> collectingLongWondernumbers() {
    Long generatedPermutation = generateLongWondernumber();
    if (wonderlandNumbers.contains(generatedPermutation))
        wonderlandNumbers.add(generateLongWondernumber());
    return wonderlandNumbers;
  }

  public void viewWondernumbers() {
    wonderlandNumbers = collectingLongWondernumbers();
    wonderlandNumbers.stream().forEach(System.out::println);
  }
}

package wonderland;

import wonderland.logic.WonderlandNumberGenerator;

public class WonderNumberApplication {

  private static WonderlandNumberGenerator generator = new WonderlandNumberGenerator();

  public static void main(String[] args) {
    generator.viewWondernumbers();
  }
}

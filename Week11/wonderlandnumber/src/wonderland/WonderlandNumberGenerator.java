package wonderland;

public class WonderlandNumberGenerator {

  public static int length = 6;
  public static int[] digits;
  public static int wonderlandNumber = 100007;

  public static void main(String[] args) {
    System.out.println(wonderlandNumber);
  }

  public static void ausgabe(int[]a){
    for (int i=0; i<=length; i++) {
      System.out.println(a[i]);
    }
    System.out.println("");
  }

  public static void vertausche (int[]a, int i, int j) {
      int ablage= a[i];
      a[i]= a[j];a[j]= ablage;
  }

  public static void perm(int[]a, int endIndex) {
      if (endIndex==0) ausgabe(a);
      else {
        perm(a, endIndex - 1);
        for (int i = 0; i <= endIndex - 1; i++) {
          vertausche(a, i, endIndex);
          perm(a, endIndex - 1);
          vertausche(a, i, endIndex);
        }
      }
  }

}

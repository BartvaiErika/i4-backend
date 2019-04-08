package week12programming;

public class Permutation {
        public static void main(String[] args) {
            Integer n = 4;
            int[] a = new int[n];

            // insert integers 0..n-1
            for (int i = 0; i < n; i++)
                a[i] = i;

            // shuffle
            for (int i = 0; i < n; i++) {
                int r = (int) (Math.random() * (i+1));     // int between 0 and i
                int swap = a[r];
                a[r] = a[i];
                a[i] = swap;
            }

            // print permutation
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println("");

            // print checkerboard visualization
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[j] == i) System.out.print(i + " ");
                    else           System.out.print(j + " ");
                }
                System.out.println("");
            }
        }

}

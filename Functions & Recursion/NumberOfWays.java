import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static int count = 0;

     public static void sum(int x, int j) {
          if (x == 0) {
               count++;
          }
          if (x < j) {
               return;
          } else {
               for (int i = j; i <= x; i++) {
                    x = x - i;
                    sum(x, i + 1);
                    x = x + i;
               }
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while (t-- > 0) {
               int n = sc.nextInt();
               if (n < 1) {
                    System.out.println(0);
                    continue;
               }
               sum(n, 1);
               System.out.println(count);
               count = 0;
          }
     }
}
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner sc = new Scanner(System.in);
          int testCases = sc.nextInt();
          while (testCases > 0) {
               int n = sc.nextInt();
               int a = sc.nextInt();
               int min = a;
               for (int i = 1; i < n; i++) {
                    a = sc.nextInt();
                    if (a < min)
                         min = a;
               }
               System.out.println(min);
               testCases--;
          }
     }
}
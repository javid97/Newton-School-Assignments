import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner scan = new Scanner(System.in);
          int testcase = scan.nextInt();
          while (testcase > 0) {
               long n = scan.nextLong();
               System.out.println(calculate(n));
               testcase--;
          }
     }

     public static long calculate(long n) {
          if (n == 0)
               return 0;
          else {
               long groups = (n - 1) / 3 + 1;
               return groups * groups + calculate(n - groups);
          }
     }
}
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          for (int i = 1; i <= n; i++) {
               if (i % 3 == 0 && i % 5 == 0)
                    System.out.print("NewtonSchool ");
               else if (i % 3 == 0)
                    System.out.print("Newton ");
               else if (i % 5 == 0)
                    System.out.print("School ");
               else
                    System.out.print(i + " ");
          }
     }
}
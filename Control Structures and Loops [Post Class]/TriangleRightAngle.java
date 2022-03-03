import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          for (int i = 0; i < 5; i++) {
               for (int j = 0; j <= i; j++)
                    System.out.print("* ");
               System.out.println();
          }
     }
}
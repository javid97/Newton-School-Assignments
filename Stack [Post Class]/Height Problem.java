import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = scan.nextInt();
               boolean found = false;
               for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] < arr[i]) {
                         System.out.print(arr[j] + " ");
                         found = true;
                         break;
                    }
               }
               if (!found)
                    System.out.print(-1 + " ");
          }
     }
}
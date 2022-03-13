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
          for (int i = 0; i < n; i++)
               arr[i] = scan.nextInt();
          boolean flag = false;
          for (int i = 0; i < n - 2; i++) {
               if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                    System.out.println("Yes");
                    flag = true;
                    break;
               }
          }
          if (!flag)
               System.out.println("No");
     }
}
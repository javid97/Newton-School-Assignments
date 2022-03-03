import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int arr[] = new int[n];
          arr[0] = s.nextInt();
          System.out.print(-1 + " ");
          for (int i = 1; i < n; i++) {
               arr[i] = s.nextInt();
               int j = i - 1;
               boolean found = false;
               while (j >= 0) {
                    if (arr[j] <= arr[i]) {
                         System.out.print(arr[j] + " ");
                         found = true;
                         break;
                    }
                    j--;
               }
               if (!found)
                    System.out.print(-1 + " ");
          }
     }
}

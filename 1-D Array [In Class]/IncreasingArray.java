import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here

          Scanner sc = new Scanner(System.in);
          int n;
          n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++)
               arr[i] = sc.nextInt();

          int count = 2;
          boolean flag = false;

          for (int i = 1; i < arr.length; i++) {
               while (count <= arr[i] && arr[i] % count != 0) {
                    count++;
               }
               if (arr[i] < count) {
                    System.out.println("NO");
                    flag = true;
                    break;
               }
               count++;
          }

          if (flag == false) {
               System.out.println("YES");
          }

     }
}
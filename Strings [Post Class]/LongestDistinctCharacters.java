import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner scan = new Scanner(System.in);
          int testcases = scan.nextInt();
          while (testcases > 0) {
               String str = scan.next();
               int ans = 0;
               int j = 0;
               int[] arr = new int[256];
               Arrays.fill(arr, -1);

               for (int i = 0; i < str.length(); i++) {
                    int index = (int) str.charAt(i);
                    j = Math.max(j, arr[index] + 1);
                    ans = Math.max(ans, i - j + 1);
                    arr[index] = i;
               }
               System.out.println(ans);

               testcases--;
          }
     }
}
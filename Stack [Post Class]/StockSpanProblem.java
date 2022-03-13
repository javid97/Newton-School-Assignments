import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int price[] = new int[n];
          for (int i = 0; i < n; i++)
               price[i] = s.nextInt();
          Stack<Integer> st = new Stack<>();
          st.push(0);
          System.out.print(1 + " ");
          for (int i = 1; i < n; i++) {
               while (!st.empty() && price[st.peek()] <= price[i])
                    st.pop();
               int stock = (st.empty()) ? (i + 1) : (i - st.peek());
               System.out.print(stock + " ");
               st.push(i);
          }

     }
}
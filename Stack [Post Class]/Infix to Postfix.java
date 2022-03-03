import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
          // Your code here
          Scanner scan = new Scanner(System.in);
          String infix = scan.nextLine();
          System.out.print(infixToPostfix(infix));
     }

     public static String infixToPostfix(String infix) {
          Stack<Character> stk = new Stack<>();
          String postfix = "";
          for (int i = 0; i < infix.length(); i++) {
               char ch = infix.charAt(i);

               if ((int) ch >= 65 && (int) ch <= 91)
                    postfix += ch;

               else if (ch == '(')
                    stk.push(ch);

               else if (ch == ')') {
                    while (!stk.empty() && stk.peek() != '(')
                         postfix += stk.pop();
                    stk.pop();
               }

               else {

                    if (stk.empty())
                         stk.push(ch);

                    else {

                         if (precedence(ch) > precedence(stk.peek()))
                              stk.push(ch);

                         else {
                              while (!stk.empty() && precedence(ch) <= precedence(stk.peek()))
                                   postfix += stk.pop();
                              stk.push(ch);
                         }
                    }
               }

          }

          while (!stk.empty())
               postfix += stk.pop();

          return postfix;
     }

     public static int precedence(char ch) {
          switch (ch) {
               case '+':
               case '-':
                    return 1;
               case '*':
               case '/':
                    return 2;
               case '^':
                    return 3;
          }
          return -1;
     }
}
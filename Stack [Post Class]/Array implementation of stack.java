/*
    int top=-1; // index of current top
    int a[] // array which contain element of stack 
*/
// function to add element in the stack
//x=element to be added
//size=maximum size of array
 void push(int x,int size)
    {
        //enter  your code here
        if(top == size - 1) System.out.println("Stack overflow");

        else{
            if(top == -1) top = 0;
            else top++;
            a[top] = x;
        }
    }

    // Function to pop element from stack
     void pop()
    {
       // enter your code here
       if(top == -1) System.out.println("Stack underflow");

       else{
           if(top == 0) top = -1;
           else top--;
       }

    }

     void top()
    {
        //enter your code here
        if(top == -1) System.out.println("Empty stack");
        else System.out.println(a[top]);
    }
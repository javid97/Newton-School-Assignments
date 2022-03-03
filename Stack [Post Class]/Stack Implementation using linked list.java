/*  
    
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
 */

 Node top = null;
public void push(int x){
    //enter your code here
    Node node = new Node(x);
    if(top == null) top = node;
    else{
        node.next = top;
        top = node;
    }
}

public void pop(){
    //enter your code 
    if(top != null) top = top.next;
}

public void top(){
    //enter your code here
    if(top == null) System.out.println(0);
    else System.out.println(top.val);
}
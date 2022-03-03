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
public static boolean IsPalindrome(Node head) {
    //enter your code here
    Stack<Integer> stk = new Stack<>();
    Node temp = head;
    while(temp != null){
        stk.push(temp.val);
        temp = temp.next;
    }
    while(head != null){
        if(head.val != stk.pop()) return false;
        head = head.next;
    }
    return true;
}
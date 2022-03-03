/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
public static Node deleteElement(Node head,int k) {
    //enter your code here
    Node rev = head;
    while(rev.next != null) rev = rev.next;

    for(int i = 1; i < k; i++) rev = rev.prev;
    if(rev.prev == null)
        return rev.next;
    rev.prev.next = rev.next;
    return head;
}
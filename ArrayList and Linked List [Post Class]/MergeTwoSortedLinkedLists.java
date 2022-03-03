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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
    //Enter your code here
    if(head1 == null) return head2;
    if(head2 == null) return head1;
         
    if(head1.val < head2.val){
        head1.next = Merge(head1.next, head2);
        return head1;
    }
    head2.next = Merge(head1, head2.next);
    return head2;
}
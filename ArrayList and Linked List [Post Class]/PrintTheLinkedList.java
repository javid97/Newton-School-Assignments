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
public static void printList(Node head) {
    while(head != null){
        System.out.print(head.val + " ");
        head = head.next;
    }
}
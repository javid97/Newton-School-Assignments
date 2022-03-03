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

public static Node deleteElement(Node head,int k) {
    //enter your code here
        Node first = head;
        Node second = head;
        for (int i = 0; i < k; i++) {
            if (second.next == null) {
                if (i == k - 1)
                    head = head.next;
                return head;
            }
            second = second.next;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return head;
}
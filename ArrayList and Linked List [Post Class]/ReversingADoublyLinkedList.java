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
public static Node Reverse(Node head) {
  //complete this function
  Node temp = head;
  while(temp.next != null){
    Node tem = temp.next;
    temp.next = temp.prev;
    temp.prev = tem;
    temp = tem;
  }
  Node tem = temp.next;
  temp.next = temp.prev;
  temp.prev = tem;
  return temp;
}
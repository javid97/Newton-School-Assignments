public static Node intersection(Node head1,Node head2){
//Enter your code here

int l1 = getLength(head1);
int l2 = getLength(head2);

if(l1>l2){
    int diff = l1-l2;
    while(diff>0){
        head1 = head1.next;
        diff--;
    }
}
else{
    int diff = l2-l1;
    while(diff>0){
        head2 = head2.next;
        diff--;
    }
}
while(head1 != null && head2 != null){
    if(head1==head2){
        return head1;
    }
    else{
        head1=head1.next;
        head2=head2.next;
    }
}
return head1;
}

public static int getLength(Node head){
    int length=0;
    while(head != null){
        length++;
        head =head.next;
    }
    return length;
}
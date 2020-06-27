class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        Node newHead=head,old=null;
        while(newHead.next!=null)
        {
            newHead=newHead.next;
        }
        newHead.next=head;
        while(k>0){
            old=head;
            head=head.next;
            k--;
        }
        old.next=null;
        return head;
    }
}

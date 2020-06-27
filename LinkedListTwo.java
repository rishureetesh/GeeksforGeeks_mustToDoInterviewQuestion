class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        if(head.next==null){
            return head;
        }
        Node newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}

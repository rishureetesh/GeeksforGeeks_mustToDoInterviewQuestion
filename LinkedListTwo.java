class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        Node current = head;
        Node prev = null;
        
        while(current!=null){
            head = current.next;
            current.next = prev;
            prev = current;
            current = head;
        }
        return prev;
    }
}


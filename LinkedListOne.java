//Java code snippet for returning the middle element of a linked list
class Solution
{
    int getMiddle(Node head)
    {
        int count=0;
        Node new_node=head;
        if(new_node==null){
            return -1;
        }
         while(new_node!=null){
             new_node=new_node.next;
             count++;
         }
         new_node=head;
         count=(count/2)+1;
        for(int i=1;i<count;i++,new_node=new_node.next);
         return new_node.data;
    }
}

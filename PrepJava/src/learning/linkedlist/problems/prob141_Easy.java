package learning.linkedlist.problems;

import learning.linkedlist.Node;

public class prob141_Easy {
    public static void main(String[] args) {
        Node nd1=new Node(3);
        Node nd2=new Node(2);
        Node nd3=new Node(0);
        Node nd4=new Node(4);

        nd1.next=nd2;
        nd2.next=nd3;
        nd3.next=nd4;
       nd4.next=nd2;

        Node head=nd1;
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }
}

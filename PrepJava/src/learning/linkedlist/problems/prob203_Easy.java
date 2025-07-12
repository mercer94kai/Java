package learning.linkedlist.problems;

import learning.linkedlist.Node;

import static learning.linkedlist.problems.prob83_Easy.printlist;

public class prob203_Easy {
    public static void main(String[] args) {

        Node a1=new Node(7);
        Node a2=new Node(7);
        Node a3=new Node(7);
        Node a4=new Node(7);
//        Node a5=new Node(4);
//        Node a6=new Node(5);
//        Node a7=new Node(6);

        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
//        a4.next=a5;
//        a5.next=a6;
//        a6.next=a7;
        
        Node head=a1;
        int val=7;
        //printlist(head);

        Node newHead=removeElements(head,val);

        printlist(newHead);
    }

    private static Node removeElements(Node head, int val) {

       Node temp=new Node(0);
       Node curr=temp;
       temp.next=head;

       while(curr.next!=null){
           if(curr.next.data==val){
               curr.next=curr.next.next;
           }
           else{
               curr=curr.next;
           }
       }
       return temp.next;
    }
}



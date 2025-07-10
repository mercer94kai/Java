package learning.linkedlist.problems;

import learning.linkedlist.Node;

import java.util.Arrays;
import java.util.LinkedList;

public class prob83_Easy {
    public static void main(String[] args) {
        Node nd1=new Node(1);
        Node nd2=new Node(1);
        Node nd3=new Node(2);
        Node nd4=new Node(3);
        Node nd5=new Node(3);

        nd1.next=nd2;
        nd2.next=nd3;
        nd3.next=nd4;
        nd4.next=nd5;

        Node head=nd1;
        printlist(head);
        System.out.println("\n");

        Node newHead=deleteDuplicates(head);
        printlist(newHead);
    }

    private static Node deleteDuplicates(Node head) {
        Node temp=head;
        while(temp!=null && temp.next!=null){
                if (temp.data==temp.next.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }
        }
        return head;
    }

    public static void printlist(Node head) {

        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
}

}

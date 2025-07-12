package learning.linkedlist.problems;

import learning.linkedlist.Node;

import javax.management.remote.rmi._RMIConnection_Stub;

public class prob160_Easy {
    public static void main(String[] args) {

        Node a1=new Node(4);
        Node a2=new Node(1);
        Node c1=new Node(8);
        Node c2=new Node(4);
        Node c3=new Node(5);
        Node b1=new Node(5);
        Node b2=new Node(6);
        Node b3=new Node(1);

        a1.next=a2;
        a2.next=c1;
        c1.next=c2;
        c2.next=c3;
        b1.next=b2;
        b2.next=b3;
        b3.next=c1;

        Node headA=a1;
        Node headB=b1;


        System.out.println(getIntersectionNode(headA,headB).data);
    }

    private static Node getIntersectionNode(Node headA, Node headB) {

        int lenA=0;
        int lenB=0;

        Node a=headA;
        Node b=headB;

        while(a!=null){
            lenA++;
            a=a.next;
        }

        while(b!=null){
            lenB++;
            b=b.next;
        }

        while(lenA>lenB){
            lenA--;
            headA=headA.next;
        }
        while(lenA<lenB){
            lenB--;
            headB=headB.next;
        }

        while (headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}

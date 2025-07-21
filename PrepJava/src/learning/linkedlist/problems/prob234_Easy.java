package learning.linkedlist.problems;

import learning.linkedlist.Node;

import java.util.ArrayList;

public class prob234_Easy {
    public static void main(String[] args) {
        Node nd1=new Node(1);
        Node nd2=new Node(2);
        Node nd3=new Node(2);
        Node nd4=new Node(1);

        nd1.next=nd2;
        nd2.next=nd3;
        nd3.next=nd4;

        Node head=nd1;
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(Node head) {

        ArrayList<Integer> al= new ArrayList<>();

        while(head!=null){
            al.add(head.data);
            head=head.next;
        }

        int l=0;
        int r=al.size()-1;

        while(l<r){
            if(al.get(l)!=al.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

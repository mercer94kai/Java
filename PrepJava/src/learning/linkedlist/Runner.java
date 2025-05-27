package learning.linkedlist;


public class Runner extends myLinkedList {

	public static void main(String[] args) {

		myLinkedList l1 = new myLinkedList();
		l1.add(2);
		l1.add(6);
		l1.add(4);
		l1.add(11);
		l1.add(9);
		l1.print();
		
		//removeDup(l1.head);
		System.out.println("\n");
		//l1.head=l1.revLinkedList(l1.head);
		l1.head=l1.revLnkLstWREC(l1.head);
		l1.print();


//	public static Node removeDup(Node head) {
//
//		if(head==null||head.next==null) {
//			return head;
//		}
//		head.next=removeDup(head.next);
//		return (head.data==head.next.data)?head.next:head;
		}
	}


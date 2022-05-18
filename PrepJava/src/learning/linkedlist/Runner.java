package learning.linkedlist;


public class Runner extends myLinkedList {

	public static void main(String[] args) {

		myLinkedList l1 = new myLinkedList();
		l1.add(2);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(4);
		//l1.print();
		
		removeDup(l1.head);
		l1.print();
	}

	public static Node removeDup(Node head) {
		
		if(head==null||head.next==null) {
			return head;
		}
		head.next=removeDup(head.next);
		return (head.data==head.next.data)?head.next:head;
		}
	}


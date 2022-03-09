package learning.linkedlist;


public class Runner extends myLinkedList {

	public static void main(String[] args) {

		myLinkedList l1 = new myLinkedList();
		myLinkedList l2 = new myLinkedList();
		myLinkedList out = new myLinkedList();
		l1.add(8);
		l1.add(6);
		l1.add(3);
		l1.add(9);
		l2.add(3);
		l2.add(1);
		l2.add(2);
		l2.add(1);
		l1.print();
		System.out.println("");
		l2.print();
		//System.out.println(isPalingdrome(out));
		//out=additionLinedList(l1, l2);
		System.out.println("");
		//out.print();
		System.out.println("");
		mergeList(l1.head, l2.head);

	}


	}


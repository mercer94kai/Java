package learning.linkedlist;

public class Runner {

	public static void main(String[] args) {

		myLinkedList mll = new myLinkedList();
		mll.add(43);
		mll.add(32);
		mll.add(10);
		mll.add(4);
		mll.add(88);
		
		//mll.print();
		
		//mll.head = mll.revLinkedList(mll.head);
		mll.print();
		System.out.println("");
		System.out.println(mll.size);
		System.out.println("");
		//mll.updateNode(4, 22);
		mll.addNode(3, 35);
		mll.print();
	}

}


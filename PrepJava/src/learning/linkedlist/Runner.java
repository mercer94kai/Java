package learning.linkedlist;

public class Runner {

	public static void main(String[] args) {

		myLinkedList l1 = new myLinkedList();
		myLinkedList l2 = new myLinkedList();
		myLinkedList out = new myLinkedList();
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l1.print();
		System.out.println("");
		l2.print();
		//System.out.println(isPalingdrome(mll));
		out=addLinedList(l1, l2);
		System.out.println("");
		out.print();
		}
	
	private static myLinkedList addLinedList (myLinkedList l1, myLinkedList l2) {
		
		if (l1.head ==null && l2.head == null) return null;
		if (l1.head ==null && l2.head != null) return l2;
		if (l1.head !=null && l2.head == null) return l1;
		
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		myLinkedList l3 = new myLinkedList();
		int carryForward =0;
		
		
		while (temp1 != null || temp2 != null || carryForward != 0) {
			
			int val1 = (temp1 == null)? 0:temp1.data;
			int val2 = (temp2 == null)? 0:temp2.data;
			int sum = val1+val2+carryForward;
			carryForward = sum/10;
			sum =sum%10;
			l3.add(sum);
			temp1 = (temp1==null)?null:temp1.next;
			temp2 = (temp2==null)?null:temp2.next;
		}
		if (carryForward!=0) {
			l3.add(carryForward);
		}
		
		return l3;
	}
	
	private static boolean isPalingdrome(myLinkedList ml) {
		
		if (ml.head == null) {
			return false;
		}
		Node mid = ml.middleNode(ml.head);
		Node last = ml.revLinkedList(mid);
		Node curr = ml.head;
		while (last != null) {
			if (last.data != curr.data) {
				return false;
			}
			else {
			last = last.next;
			curr = curr.next;
			}
		}
		return true;

	}

}


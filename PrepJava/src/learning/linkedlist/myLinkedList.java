package learning.linkedlist;


public class myLinkedList {

	Node head;

	static int pos;
	static int size;

	public void add(int data) {

		Node addNewNode = new Node(data); 

		if (head == null) {
			head = addNewNode;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp=temp.next;
		}
		temp.next = addNewNode;
	}

	public Node revLinkedList(Node head) {

		Node prev = null;
		Node current = head;
		Node temp = null;
		while (current != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}

	public Node revLnkLstWREC(Node head){
		if (head==null || head.next==null ){
			return head;
		}
		Node newHead=revLnkLstWREC(head.next);
		Node headnext=head.next;
		headnext.next=head;
		head.next=null;
		return newHead;
	}
	public void print() {

		Node temp = head;
		size=0;
		while (temp != null) {

			System.out.print("\""+temp.data+"\" ");
			temp = temp.next;
			size++;
		}
	}

	public void updateNode(int index, int data) {

		Node temp = head;
		if (index ==0) {
			temp.data=data;
		}
		pos=0;
		try {	
			while (temp!=null) {
				temp = temp.next;
				pos++;
				if (pos==index) {
					temp.data=data;
				}
			}
		}
		catch (Exception e) {
			System.out.println("Entered Index is Invalid.... Please enter a proper Index");
		}
	}

	public Node middleNode (Node head) {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static myLinkedList additionLinedList (myLinkedList l1, myLinkedList l2) {

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

	public static boolean isPalingdrome(myLinkedList ml) {

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

	public void addNode(int index, int data) {

		Node newNode =new Node(data);
		Node temp = head;
		Node nTemp1, nTemp2;
		pos=0;
		if (pos == index) {
			nTemp1 = temp.next;
			nTemp2 = newNode;
			temp.next=nTemp2;
			nTemp2.next=nTemp1;
		}

		while (temp != null) {
			temp=temp.next;
			pos++;
			try{
				if (pos==index) {
					nTemp1 = temp.next;
					nTemp2 = newNode;
					temp.next=nTemp2;
					nTemp2.next=nTemp1;
				}
			}catch (Exception e) {
				System.out.println("Entered Index is Invalid.... Please enter a proper Index");
			}
		}

	}

	public static void mergeList(Node head1, Node head2) {

		myLinkedList mergeList = new myLinkedList();
		Node temp = head1;

		while (temp!= null){
			mergeList.add(temp.data);
			temp = temp.next;
		}

		temp=head2;
		while (temp!= null){
			mergeList.add(temp.data);
			temp = temp.next;
		}
		sortedll(mergeList.head);
		mergeList.print();

	}

	public static void sortedll(Node head) {

		Node current = head;
		Node index = null;
		if (current == null) {
			System.out.println("list is empty");
		}
		else {
			while (current!=null) {
				index = current.next;
				while (index!=null) {
					if (current.data>index.data) {
						int temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current =current.next;
			}
		}
	}



}	

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

	public Node revLinkedList(Node node) {
		
		 	Node prev = null;
	        Node current = node;
	        Node temp = null;
	        while (current != null) {
	            temp = current.next;
	            current.next = prev;
	            prev = current;
	            current = temp;
	        }
	        return prev;
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
	
	
}	

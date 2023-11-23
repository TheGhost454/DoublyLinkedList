public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		private Object data;
		private Node next;
		private Node prev;

		private Node(Object data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}

	}

	public void addFirst(Object val) {
		Node newNode = new Node(val);

		newNode.next = head;

		if(head != null) 
		{
			newNode.prev = null;
			newNode.next = head;
			head.prev = newNode;
		}
			head = newNode;
		if(head.next == null) 
		{
			tail=head;
		}
		size++;
		
	}

	public void addLast(Object val) {
		Node newNode = new Node(val);

		if (size == 0) {
			addFirst(val);
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.prev = null;
			newNode.next = null;
			size++;
		}
	}

	public String toString() {
		if (head == null) {
			return "";
		}

		Node temp = head;

		String str = "";

		while (temp.next != null) {
			str += temp.data + " | ";
			temp = temp.next;
		}
		str += temp.data;
		return str;

	}

	Node node(int index) {
		Node n = head;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		return n;
	}

	public void add(int index, int num) {
		if (index == 0) {
			addFirst(num);
		} else {
			Node temp1 = node(index - 1);
			Node temp2 = temp1.next;
			Node newNode = new Node(num);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if (newNode.next == null) {
				tail = newNode;
			}
		}

	}

	public void deleteFirst() {
		if (size == 0) {
			System.out.println("No node exist");
		}
		if(head!=null) {
			head = head.next; 
			size--;
		}
	}

	public void deleteLast() {
		if (size == 0) {
			System.out.println("No node exist");
		}
		else {
			Node temp = node(size - 2);
			tail = temp; 
			tail.next = null;
			size--;
		}
	}

	public void delete(int i) {
		if (size == 0) {
			System.out.println("Nothing to delete");
		}
		else if (i == 0){
			deleteFirst();
		}
		else if (i == size - 1) {
			deleteLast();
		}
		else {
			Node temp1 = node(i - 1); 
			Node temp2 = node(i + 1);
			temp1.next = temp2;
			size--;
		}
	}

	public int size() {
		return size;
	}

	public DoublyLinkedList.Node get(int i) {
			return node(i);
	}
}


public class Rizzo_assignment4 {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(40);
		list.add(2,25);
		System.out.println("Index at 3: " + list.get(3));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " | ");
		}
		
		System.out.println();
		list.deleteFirst();
		list.deleteLast();
		list.delete(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " | ");
		}
		System.out.println();
		
		System.out.println("List size: " + list.size());
		
	}

}

package in.linkedList.doubly;

public class DoublyedLinkedListDemo {
	public static void main(String[] args)throws Exception {
		DoublyLinkedList d=new DoublyLinkedList();
		d.addFirst(50);
		d.addFirst(70);
		d.display();
		d.addFirst(40);
		d.addFirst(90);
		d.display();
		d.size();
		System.out.println(d.getSize());
		d.addLast(100);
		d.display();
		d.addLast(200);
		d.display();
		d.size();
		System.out.println("////");
		d.addAt(3, 80);
		d.display();
		System.out.println("////");
		d.addAt(d.getSize(), 800);
		d.display();
		d.addAt(0, 800);
		d.display();
		d.addFirst(900);
		d.display();
		d.reverse();
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.getAt(d.getSize()-1));
		System.out.println("=======");
		System.out.println(d.removeFirst());
		d.reverse();
		System.out.println(d.removeLast());
		d.reverse();
		System.out.println(d.removeAt(2));
		d.reverse();
		d.display();
		
	}
}

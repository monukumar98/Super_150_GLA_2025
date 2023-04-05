package Lec48;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
		ll.AddFirst(3);
		ll.AddFirst(-3);
		ll.AddFirst(1);
		ll.AddFirst(30);
		ll.Display();
		ll.AddLast(34);
		ll.Display();
		ll.AddatIndex(-9, 3);
		ll.Display();
		//System.out.println(ll.removeFirst());
		//System.out.println(ll.removeLast());
		System.out.println(ll.removeatIndex(2));
		ll.Display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getatIndex(2));
	}

}

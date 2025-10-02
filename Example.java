import java.util.LinkedList;

public class Example{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(12);
		list.add(13);
		list.add(1);
		System.out.println(list);

		list.addFirst(45);
		list.addFirst(36);

		list.add(2,123);

		System.out.println(list);

		System.out.println("Size after addition " + list.size());
		
		Integer a =1;
		list.remove(a);
		list.remove(1);
		System.out.println(list);

		System.out.println(list);

		System.out.println("New LinkedList " + list);
		System.out.println("Size after removal " + list.size());
	}
}


import java.util.LinkedList;

public class ColectionLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(30);
		list.add(40);
		list.add(350);
		list.add(35);
		list.add(30);
		list.add(306);
		list.addLast(20);
//		list.addFirst(1);
//		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" ");
		}

	}

}

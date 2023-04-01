import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("def", 2);
		map.put("abc1", 1);
		map.put("def1", 2);
//		System.out.println("Size: "+ map.size());
//		if(map.containsKey("abc"))
//		{
//			System.out.println(map.get("abc"));
//		}
//		if(map.containsKey("abc1"))
//		{
//			System.out.println("HAS ABC!");
//		}
////		int v= map.get("abc1");
		int s = map.remove("abc");
		System.out.println(s);
		Set<String> key = map.keySet();
		for(String str : key)
		{
			System.out.println(str);
		}
	}
}

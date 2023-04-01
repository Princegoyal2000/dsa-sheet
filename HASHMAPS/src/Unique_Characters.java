import java.util.HashMap;

public class Unique_Characters {

	public static void unique_characters(String str)
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			else
			hm.put(str.charAt(i),1);
		}
		for(int i=0;i<str.length();i++)
		{
			if(hm.get(str.charAt(i))==1)
			{
				System.out.println(str.charAt(i));
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcbce";
		unique_characters(str);

	}

}

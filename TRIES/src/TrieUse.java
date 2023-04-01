import java.util.Scanner;

public class TrieUse {

	public static void main(String[] args) {


		Trie t = new Trie();
		t.add("this");
		t.add("news");
		t.add("dean");
		t.add("desk");
		System.out.println(t.advanceSearch("de"));
//		System.out.println(t.search("news"));
//		t.remove("news");
//		System.out.print(t.search("news"));
//		System.out.println(t.count_words());
	
//		for(int i=0;i<4;i++)
//		{ 
//			Scanner s = new Scanner (System.in);
//			String str = s.next();
//			int i1 =0;
//			while(i1<str.length())
//			{
//				t.add(str.substring(i1));
//				i1++;
//			}
//		}
//		System.out.println(t.search("hie"));
	}

}

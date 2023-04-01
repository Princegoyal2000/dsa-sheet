import java.util.*;
public class Reverse_words {
	public static String reverse(String s)
	{   
		String str[]=s.split(" ");
		String ans="";
		for(int i=str.length-1;i>=0;i--)
		{
			ans += str[i];
			ans += " ";
		}
		return ans;
	}
 public static void main(String args[])
 {
	Scanner ob= new Scanner(System.in);
	String s=ob.nextLine();
	System.out.println(reverse(s));
	
 }
}

import java.util.*;
public class String_Palindrome {
       public static boolean palindrome(String str1)
       {    
       	   int size=str1.length()-1;
       	   int i=0;
       	   while(size>i)
       	   {  // System.out.println(str1.charAt(i++)+" "+str1.charAt(size--));
       		   if(str1.charAt(i++)!=str1.charAt(size--))
       		   {
       			   return false;
       		   }
       	   }
       	   return true;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner S=new Scanner(System.in);
       String str=S.nextLine();
      boolean check= palindrome(str);
      System.out.println(check);

	}

}

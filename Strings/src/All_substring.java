import java.util.*;
public class All_substring {
    public static void sub(String s)
    {
    	for(int i=0;i<s.length();i++)
    	{
    		for(int j=i+1;j<=s.length();j++)
    		{
    			System.out.println(s.substring(i,j));
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner ob= new Scanner(System.in);
      String s=ob.nextLine();
      sub(s);
	}

}

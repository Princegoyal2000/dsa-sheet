import java.util.*;
public class unique_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,3,2,4};
       for(int i=0;i<arr.length;i++)
       {
    	   int j;
    	   for(j=0;j<arr.length;j++)
    	   {
    		   if(i!=j && arr[i]==arr[j])
    			   break;
    	   }
    	   if(j==arr.length)
    	   System.out.println(arr[i]);
       }
	}

}

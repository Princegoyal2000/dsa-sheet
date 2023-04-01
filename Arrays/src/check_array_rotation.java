
public class check_array_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,8,9,2,3cc};
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
	    	if(arr[i]<min)
			{min=arr[i];index=i;}
        }
          System.out.print(arr.length-index);
	}

}

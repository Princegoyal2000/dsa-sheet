import java.util.ArrayList;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,2,1,8,9,3,7,1};
		ArrayList<Integer> ob = new ArrayList<Integer>();
		boolean isPresent = false;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if( arr[i] == arr[j] )
				{
					if( ob.contains(arr[i]) )
						break;
					else {
						ob.add(arr[i]); 
						isPresent = true;
					}
				}
			}
		}
		if(isPresent == true)
			for(int val : ob)
				System.out.print( val+" " );

	}

}

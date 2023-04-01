import java.util.HashMap;

public class longest_consecutive {

	public static void long_consecutive(int a[])
	{

		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int val:a)
		{
			map.put(val, true);
		}
		for(int val:a)
		{
			if(map.containsKey(val-1))
			map.put(val, false);
		}
		int max_l=0;
		int max_strt_point=0;
		for(int val :a)
		{
			if(map.get(val)==true) {
				int temp_l=1;
				int temp_strt_point=val;
				while(map.containsKey(temp_strt_point+temp_l))
					{
					temp_l++;
					}
				
				if(temp_l>max_l)
				{
					max_l=temp_l; 
					max_strt_point=temp_strt_point;
				}
			}
				
		}
		for(int i=0;i<max_l;i++)
		{
			System.out.println(max_strt_point+i);
		}
			

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,12,9,16,10,5,3,20,25,11,18,6};
		long_consecutive(arr);

	}

}

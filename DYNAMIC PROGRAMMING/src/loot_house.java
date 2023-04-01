
public class loot_house {

	public static int loot_house(int arr[])
	{
		int min=0;
		int index=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(min<arr[i])
				index=i;
		}
		if(index%2==0)
		{
			for(int i=0;i<arr.length;i++) {
				if(i%2==0)
					sum += arr[i];
			}
		}
		else
		{
			for(int i=0;i<arr.length;i++) {
				if(i%2!=0)
					sum += arr[i];
			}			
		}
		return sum;
	}
	public static int loot_house_Dp(int arr[])
	{
		int inc=arr[0];
		int exc=0;
		for(int i=1;i<arr.length;i++)
		{
			int new_inc= exc+arr[i];
			int new_exc = Math.max(inc, exc);
			
			inc= new_inc;
			exc=new_exc;
			
		}
		int ans = Math.max(inc, exc);
		return ans;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,4,7,12,43};
		System.out.println(loot_house_Dp(arr));
		System.out.println(loot_house(arr));

	}

}

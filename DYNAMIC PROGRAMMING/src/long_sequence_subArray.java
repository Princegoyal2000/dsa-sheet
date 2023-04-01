
public class long_sequence_subArray {

	public static int long_sequal_subArray(int arr[])
	{
		int overall_max=0;
		int max=0;
		int dp[]= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					if(dp[j]>max)
						max = dp[j];
				}
			}
			dp[i]=max+1;
			if(dp[i]>overall_max)
				overall_max=dp[i];
		}
		return overall_max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[]= {10,22,9,33,21,50,41,60,80,1};
		System.out.print(long_sequal_subArray(arr));
	}

}

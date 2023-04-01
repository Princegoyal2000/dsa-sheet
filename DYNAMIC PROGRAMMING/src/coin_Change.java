
public class coin_Change {

	public static int coin_calculate(int arr[], int amount)
	{
		int dp[]= new int[amount+1];
		dp[0]=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j= arr[i];j<dp.length;j++)
			{
				dp[j] +=dp[j-arr[i]];
			}	
		}
		return dp[amount];
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5};
		int amount = 4;
		System.out.print(coin_calculate(arr,amount));

	}

}


public class CountBalancedBTs {

	public static int CBBT(int h) {
		int mod = (int)Math.pow(10, 9)+7;
		return CBBT(h,mod);
	}
	public static int CBBT(int h, int mod)
	{
		if(h==0 || h==1)
		{
			return 1;
		}
		int x = CBBT(h-1);
		int y = CBBT(h-2);
		long res1 = (long)x * x;
		long res2 = (long)x * y * 2;
		int value1 = (int)(res1 % mod);
		int value2 = (int)(res2 % mod);
		return (value1+value2) % mod;
		
	}
	public static long CBBT_DP(int h)
	{
	 int dp[]= new int [h+1];
	 int mod = 1000000007;
	 dp[0]=1;
	 dp[1]=1;
	 for(int i =2 ; i<=h ; i++)
	 {
		 dp[i]=(dp[i-1]*((2*dp[i-2])%mod + dp[i-1])%mod)%mod;
		 
	 }
	 return dp[h];
	}
	public static void main(String[] args) {
		
		System.out.println(CBBT(11));
		System.out.println(CBBT_DP(11));

	}

}

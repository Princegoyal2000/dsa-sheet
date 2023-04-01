
public class Minimum_squares {

	public static int minimum_squares(int n)
	{
		int dp[]= new int[n+1];
		dp[0]=0;
	    dp[1]=1;
	    for(int i = 2 ;i <= n ; i++)
	    {
	    	int min = Integer.MAX_VALUE;
	    	for(int j=1;j*j<i;j++)
	    	{
	    		int rem = i-j*j;
	    		if(dp[rem]<min)
	    		{
	    			min=dp[rem];
	    		}
	    	}
	    	dp[i]=1+min;
	    }
	    return dp[n];
	}
	public static void main(String args[])
	{
	
		int n=11;
		System.out.println(minimum_squares(n));
	}

}

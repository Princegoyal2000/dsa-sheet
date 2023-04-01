
public class Coin_Tower {

	public static boolean A_will_win_or_not(int n,int x,int y)
	{
		boolean dp[]= new boolean [n+1];
		dp[0]=false;
		dp[1]=true;
		for(int i=2;i<=n;i++)
		{
			if(i-1>=0 && dp[i-1]==false)
				dp[i]=true;
			else if(i-x>=0 && dp[i-x]==false)
				dp[i]=true;
			else if(i-y>=0 && dp[i-y]==false)
				dp[i]=true;
			else
				dp[i]=false;
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		int x=4;
		int y = 5;
		System.out.println(A_will_win_or_not(n,x,y));
	}

}

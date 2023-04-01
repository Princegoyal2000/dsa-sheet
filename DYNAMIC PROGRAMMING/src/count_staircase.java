
public class count_staircase {

	public static int count_paths(int n)
	{
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		int path1 = count_paths(n-1);
		int path2 = count_paths(n-2);
		int path3 = count_paths(n-3);
		
		return path1+path2+path3;

		
	}
	
	public static int count_pathsDP(int n)
	{
		
		return count_pathsDp(n,new int[n+1]);
	}
	
	public static int count_pathsDp(int n , int arr[])
	{
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		
		if(arr[n]>0)
			return arr[n];
		int path1 = count_pathsDp(n-1,arr);
		int path2 = count_pathsDp(n-2,arr);
		int path3 = count_pathsDp(n-3,arr);
		
		arr[n]=path1+path2+path3;
		return arr[n];

		
	}
	public static int countPathTabulation(int n)
	{
//
//		
//		1.STORAGE AND MEANING
//		2.DIRECTION(<  >)
//		3.TRAVEL AND SOLVE
//		
//		
//		
		int dp[] = new int[n+1];
		dp[0] = 1;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
				dp[i] = dp[i-1];
			else if(i==2)
				dp[i] = dp[i-1] + dp[i-2];
			else
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
				
		}
		return dp[n];
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPathTabulation(4));
		System.out.println(count_pathsDP(4));
        System.out.println(count_paths(4));
	}

}

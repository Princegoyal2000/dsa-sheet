import java.util.*;
public class largest_square_submatrix {

	public static int count_largest_subMatrix(int arr[][])
	{
		int dp[][]= new int [arr.length][arr[0].length];
		int ans=0;
		for(int i = dp.length-1; i >=0 ; i--)
		{
			for(int j = dp[0].length-1; j>=0; j --)
			{
				if(i==dp.length-1 && j == dp[0].length-1)
					dp[i][j]=arr[i][j];
				else if(i==dp.length-1)
					dp[i][j]=arr[i][j];
				else if(j == dp[0].length-1)
					dp[i][j]=arr[i][j];
				else
				{
					if(arr[i][j]==0)
						dp[i][j]=0;
					else
					{
						int val = Math.min(dp[i][j+1],dp[i+1][j]);
					    val = Math.min(dp[i+1][j+1], val);
						
						dp[i][j]=val+1;
						
						
						if(dp[i][j]>ans)
							ans=dp[i][j];
					}
				}
					
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][]= new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				arr[i][j]=s.nextInt();
			}
		System.out.println(count_largest_subMatrix(arr));

	}

}

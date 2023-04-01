
public class minimum_cost_path {

	public static int minimum_costDP(int arr[][])
	{
		int m = arr.length;
		int n = arr[0].length;
		int storage[][]= new int[m][n];
		storage[m-1][n-1]=arr[m-1][n-1];
		for(int j=n-2;j>=0;j--)
		{
			storage[m-1][j]=arr[m-1][j]+storage[m-1][j+1];
		}
		for(int i =m-2;i>=0;i--)
		{
			storage[i][n-1]=arr[i][n-1]+storage[i+1][n-1];
		}
		for(int i=m-2;i>=0;i--)
			for(int j=n-2;j>=0;j--)
			{
				storage[i][j]=arr[i][j]+Math.min(storage[i+1][j+1],Math.min(storage[i+1][j],storage[i][j+1]));
			}
		return storage[0][0];
	}
	public static void main(String[] args) {
	  
		int arr[][]= {{1,1,1},{4,5,2},{7,8,9}};
		System.out.println(minimum_costDP(arr));
		System.out.println(minimum_costM(arr));
		System.out.println(minimum_cost(arr));

	}

	public static int minimum_cost(int[][] arr) {

		return minimum_cost(arr,0,0);
	}

	private static int minimum_cost(int[][] arr, int i, int j) {

		int m= arr.length;
		int n = arr[0].length;
		if(i==m-1 && j==n-1)
			return arr[i][j];
		
		if(i>=m || j>=n)
			return Integer.MAX_VALUE;
		
		int op1 = minimum_cost(arr,i+1,j);
		int op2 = minimum_cost(arr,i+1,j+1);
		int op3 = minimum_cost(arr,i,j+1);
		
		
		return arr[i][j]+Math.min(op1,Math.min(op2, op3));
	}

	public static int minimum_costM(int[][] arr) {

		int storage[][]=new int[arr.length][arr[0].length];
		return minimum_costM(arr,0,0,storage);
	}

	private static int minimum_costM(int[][] arr, int i, int j,int storage[][]) {

		int m= arr.length;
		int n = arr[0].length;
		
		if(i>=m || j>=n)
			return Integer.MAX_VALUE;
		
		if(i==m-1 && j==n-1)
		{
			storage[m-1][n-1] = arr[i][j];
			return storage[i][j];
		}
		

		if(storage[i][j]!=0)
			return storage[i][j];
		
		int op1 = minimum_costM(arr,i+1,j,storage);
		int op2 = minimum_costM(arr,i+1,j+1,storage);
		int op3 = minimum_costM(arr,i,j+1,storage);
		
		storage[i][j]= arr[i][j]+Math.min(op1,Math.min(op2, op3));
		return storage[i][j];
	}
}

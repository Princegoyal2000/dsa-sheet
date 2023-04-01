import java.util.Scanner;

public class count_the_number_of_islands {

	public static void count_the_number_of_islands1(int edges[][],int i,int j,boolean visited[][])
	{
		if(i<0 || j<0 || i>=edges.length || j>=edges[0].length || edges[i][j]==1 || visited[i][j]==true)
			return;
			
		visited[i][j]=true;
		count_the_number_of_islands1(edges,i-1,j,visited);
		count_the_number_of_islands1(edges,i,j-1,visited);
		count_the_number_of_islands1(edges,i,j+1,visited);
		count_the_number_of_islands1(edges,i+1,j,visited);
		
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int m = s.nextInt();
		int edges[][]= new int[n][m];
		for(int i=0;i<edges.length;i++)
		{
			for(int j=0;j<edges[0].length;j++)
			{
				edges[i][j]=s.nextInt();
			}
		}
		
		
		boolean visited[][] = new boolean[edges.length][edges[0].length];
		int count=0;
		
		for(int i=0;i<edges.length;i++)
		{
			for(int j=0;j<edges[i].length;j++)
			{
				if(edges[i][j]==0 && !visited[i][j])
				{
					count_the_number_of_islands1(edges,i,j,visited);
					count++;
				}
			}			
		}


		System.out.println(count);
	}

}

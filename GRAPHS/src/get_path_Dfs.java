import java.util.ArrayList;
import java.util.Scanner;

public class get_path_Dfs {

	public static void getPath(int edges[][],boolean visited[],int si,int ei,ArrayList<Integer> path)
	{
		if(si==ei)
		{
			System.out.println(path);
			return;
		}
		visited[si]=true;
		int n = edges.length;
		for(int i=0;i<n;i++)
		{
			if(edges[si][i]==1 && !visited[i])	
			{
				path.add(i);
				getPath(edges,visited,i,ei,path);
			}
		}
		visited[si]=false;
	}
	public static void getPath(int edges[][],int si, int ei)
	{  
		ArrayList<Integer>  path = new ArrayList<Integer>();
		boolean visited[] = new boolean[edges.length];
		path.add(si);
		getPath(edges,visited,si,ei,path);	


	}
	
	public static void main(String args[])
	{
		int n ;
		int e;
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		e=s.nextInt();
		int si = s.nextInt();
		int ei = s.nextInt();
		int edges[][]= new int[n][n];
		for(int i=0;i<e;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
         getPath(edges,si,ei);
  }
}

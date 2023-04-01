import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Is_Cyclic_BFS {

	public static void cyclic_or_not(int edges[][])
	{   //this is basically a DFS that is Depth first search
		boolean visited[] = new boolean[edges.length];
		for(int i=0;i<edges.length;i++)
		{
			if(!visited[i])
			{
				   Boolean check =cyclic_or_not(edges,i,visited);
					if(check)
					{
						System.out.println(true);
						return;
					}
			}
		}
		System.out.println(false);
	}
	public static boolean cyclic_or_not(int edges[][],int sv,boolean visited[])
	{
		Queue<Integer> pending = new LinkedList<>();
		pending.add(sv);
		while(!pending.isEmpty())
		{
			int front = pending.poll();
			if(visited[front]==true)
			{
				return true;
			}
			visited[front]=true;
			int n = edges.length;
			for(int i=0;i<n;i++)
			{
				if(edges[sv][i]==1 && !visited[i])
				{
					pending.add(i);
				}
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		int n ;
		int e;
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		e=s.nextInt();
		int edges[][]= new int[n][n];
		for(int i=0;i<e;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
        cyclic_or_not(edges);
		
	}
}

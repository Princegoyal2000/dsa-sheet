import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class has_path {

	public static boolean has_path1(int edges[][],int si,int ei)
	{   
		boolean visited[] = new boolean[edges.length];
		if(edges[si][ei]==1)
			return true;
		else
		return 	has_path1(edges,si,visited,ei);
		
	}
	public static boolean has_path1(int edges[][] , int si , boolean visited[] , int ei )
	{
		Queue<Integer> pending = new LinkedList<>();
		pending.add(si);
		visited[si]=true;
		while(!pending.isEmpty())
		{
			int front = pending.poll();
	        if(front == ei)
	        	return true;
			int n = edges.length;
			for(int i=0;i<n;i++)
			{
				if(edges[front][i]==1 && !visited[i])
				{
					pending.add(i);
					visited[i]=true;
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
		int si=s.nextInt();
		int ei=s.nextInt();
		int edges[][]= new int[n][n];
		for(int i=0;i<e;i++)
		{
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
      System.out.println(has_path1(edges,si,ei));
		
	}
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Bipartite {

public static  class pair{
	int i;
	String psf;
	int level;
	
	pair(int i,String psf,int level)
	{
		this.i=i;
		this.psf=psf;
		this.level=level;;
	}
	
}
	public static void Bipartite_or_not(int edges[][])
	{  
		//this is basically a DFS that is Depth first search
		
		
		int visited[] = new int[edges.length];
		Arrays.fill(visited,-1);
		for(int i=0;i<edges.length;i++)
		{
			if(visited[i] == -1)
			{
				boolean check = Bipartite_or_not(edges,i,visited);
				   if(check == false)
				   {
					   System.out.println(false);
					   return;
				   }				
			}

		}
		System.out.println(true);
	}
	public static boolean Bipartite_or_not(int edges[][],int sv,int visited[])
	{
		Queue<pair> pending = new LinkedList<>();
		pending.add(new pair( sv , sv + "" , 0 ) );
		while(!pending.isEmpty() )
		{
			pair front = pending.poll();
            if(visited[front.i]  != -1)
            {
              if(front.level != visited[front.i])
            	  return false;
            }
            else
            {
            	visited[front.i]=front.level;
            }
			for(int i=0;i<edges.length;i++)
			{
				if(edges[front.i][i]==1 && visited[i] == -1 )	
				{
					pending.add(new pair(i,front.psf+i,front.level+1));
				}
			}
		}
		return true;
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

		Bipartite_or_not(edges);
		
	}
}

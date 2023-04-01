import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class spead_of_virus {
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
        int sv = s.nextInt();
        int t = s.nextInt();
		Queue<pair> pending = new LinkedList<>();
		pending.add(new pair(sv,1));
		int visited[] = new int[n];
		int count=0;
		while(!pending.isEmpty())
		{
			pair front = pending.poll();
			if(visited[front.v] > 0)
			{
				continue;
			}
			visited[front.v]=front.time;
			if(front.time > t)
				break; 
				
			count++;
			for(int i=0;i<n;i++)
			{
				if(edges[front.v][i]==1 && visited[i]==0)
				{
					pending.add(new pair(i,front.time+1));
				}
			}
		}
		
		
		
	}
}
class pair{
	int v;
	int time;
	pair(int v,int time)
	{
		this.v=v;
		this.time=time;
	}
}

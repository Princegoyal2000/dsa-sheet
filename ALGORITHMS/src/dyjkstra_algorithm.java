import java.util.Scanner;

public class dyjkstra_algorithm {

	public static void dyjkstra(int adjacencymatrix [][])
	{
		int v = adjacencymatrix.length;
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		distance[0]=0;
		for(int i=1;i<v;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v-1;i++)
		{
			int minVertex = findminvertex(distance,visited);
			visited[minVertex]=true;
			for(int j=0;j<v;j++)
			{
				if(adjacencymatrix[minVertex][j] !=0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE)
				{
					int newDistance = distance[minVertex] + adjacencymatrix[minVertex][j];
					if(newDistance < distance[j])
					{
						distance[j]=newDistance;
					}
				}
			}
		}
		for(int i=0;i<v;i++)
		{
			System.out.println( i + " " + distance[i] );
		}
	}
	private static int findminvertex(int[] distance,boolean visited[]) {
		int min = -1;
		for(int i =0;i<distance.length;i++)
		{
			if((min ==-1 || distance[i]<distance[min]) && !visited[i])
			{
				min =  i;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int adjacencymatrix[][] = new int[v][v];
		for(int i=0;i<e;i++)
		{
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			adjacencymatrix[v1][v2]=weight;
			adjacencymatrix[v2][v1]=weight;
		}
		
		dyjkstra(adjacencymatrix);

	}

}

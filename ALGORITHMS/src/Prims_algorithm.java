//
//
//
//
//Time complexity O(v^2)
//IF WE WILL USE PRIORITY QUEUE THAN WE CAN ACHIEVE TIME COMPLEXITY OF (V+E LOG V)
//
//
//
//
import java.util.*;
public class Prims_algorithm {

	public static void prims(int adjacencymatrix[][])
	{
		int v = adjacencymatrix.length;
		boolean visited[] = new boolean[v];
		int weight[] = new int[v];
		int parent[] = new int[v];
		weight[0]=0;
		parent[0]=-1;
		for(int i=1;i<v;i++)
		{
			weight[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v;i++)
		{
			int minVertex = findminvertex(weight,visited);  //O(v)
			visited[minVertex] = true;
			for(int j =0;j<v;j++)
			{
				if(adjacencymatrix[minVertex][j] !=0 && !visited[j])
				{
					if(adjacencymatrix[minVertex][j] < weight[j])
					{
						weight[j] = adjacencymatrix[minVertex][j];
						parent[j]=minVertex;
					}
				}
			}
		}
		for(int i=1;i<v;i++)
		{
			if(parent[i]<i)
			{
				System.out.println(parent[i]+ " " + i + " " + weight[i]);
			}
			else
			{
				System.out.println(i+ " " + parent[i] + " " + weight[i]);
			}
		}
	}
	private static int findminvertex(int[] weight,boolean visited[]) {
		int min = -1;
		for(int i =0;i<weight.length;i++)
		{
			if((min ==-1 || weight[i]<weight[min]) && !visited[i])
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
		
		prims(adjacencymatrix);

	}

}

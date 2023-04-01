//
//
//  1)Take Input --size=E
//  2)Sort input array ---->E.logE
//  3)Pick n-1 edges and put in MST  before perform cycle detection which is of complexiblity EV..
//
//  ******so overall time Complexity will be "ElogE+EV"     **********
//
//
import java.util.*;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int source;
	int destination;
	int weight;
	@Override
	public int compareTo(Edge o) {
		return this.weight-o.weight;
	}
	
}
public class Krushkals_Algorithm {

 
	public static int findParent(int v, int parent[])
	{
		if(parent[v]==v)
			return v;
		return findParent(parent[v],parent);
	}
	public static void krushkal(Edge input[], int n)
	{
		Arrays.sort(input);
		
		Edge output[] = new Edge[n-1];
		int parent[] = new int[n];
		for(int i=0;i<n;i++)
		{
			parent[i]=i;
		}
		int count=0;
		int i=0;
		while(count != n-1)
		{
		    Edge currentEdge = input[i];
			int sourceParent = findParent(currentEdge.source,parent);
			int destinationParent = findParent(currentEdge.destination,parent);
			
			if(sourceParent != destinationParent)
			{
				output[count] = currentEdge;
				count++;
				parent[sourceParent] = destinationParent;
			}
			i++;
		}
		for(int j=0;j<n-1;j++)
		{
			if(output[j].source<output[j].destination)
			{
				System.out.println(output[j].source+" "+output[j].destination+" "+output[j].weight);	
			}
			else
			{
				System.out.println(output[j].destination+" "+output[j].source+" "+output[j].weight);	
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int E = s.nextInt();
		
		Edge input[] = new Edge[E];
		
		for(int i=0;i<E;i++)
		{
			input[i]= new Edge();
			input[i].source= s.nextInt();
			input[i].destination= s.nextInt();
			input[i].weight = s.nextInt();	
		}
		krushkal(input,n);

	}

}

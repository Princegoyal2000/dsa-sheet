import java.util.ArrayList;
import java.util.Scanner;

public class perfect_Friends {

	public static void drawTreeAndGenerateComps(int edges[][],int si , ArrayList<Integer> comp,boolean visited[])
	{
		visited[si]=true;
		comp.add(si);
		for(int i=0;i<edges.length;i++)
		{
			if(edges[si][i]==1 && !visited[i])
			{
				drawTreeAndGenerateComps(edges,i,comp,visited);
			}
		}
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
		ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		
		boolean[] visited = new boolean[edges.length];
		for(int i=0;i<n;i++)
		{
			if(!visited[i])
			{
				ArrayList<Integer> comp = new ArrayList<>();
				drawTreeAndGenerateComps(edges,i,comp,visited);
				comps.add(comp);
			}
		}
		int pair =0;
		for(int i=0;i<comps.size();i++)
		{
			for(int j=i+1;j<comps.size();j++)
			{
				int count = comps.get(i).size()*comps.get(j).size();
				pair = pair+count;
			}
		}
		System.out.println(pair);
	}

}
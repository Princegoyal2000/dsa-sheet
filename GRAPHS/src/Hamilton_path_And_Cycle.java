import java.util.HashSet;
import java.util.Scanner;

public class Hamilton_path_And_Cycle {
	public static void Hamiltonian(int edges[][],int src,HashSet<Integer> visited,String psf , int osrc)
	{
		if(visited.size()==edges.length-1)
		{
			System.out.println(psf);
			boolean closingEdgeFound=false;
			for(int i=0;i<edges.length;i++)
			{
				if(edges[src][i]==1)
				{
					if(i==osrc)
					{
						closingEdgeFound=true;
						break;
					}
				}
			}
			if(closingEdgeFound==true)
				System.out.println("*");
			else
				System.out.println(".");
			
			return;
		}
		visited.add(src);
		for(int i=0;i<edges.length;i++)
		{
			if(edges[src][i]==1 && visited.contains(i)==false)
			{
				Hamiltonian(edges,i,visited,psf+i,osrc);
			}
		}
		visited.remove(src);
	}

	public static void main(String[] args) {


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
		int src = s.nextInt();
		HashSet<Integer> visited = new HashSet<>();
		Hamiltonian(edges,src,visited,src+"",src);

	}

}

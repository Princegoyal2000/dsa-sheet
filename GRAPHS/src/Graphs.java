//
//
//
//  
//
//
//

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {
	public static void printDFS(int edges[][],int sv,boolean visited[])
	{    //this is basically a DFS that is Depth first search
		System.out.println(sv);
		visited[sv]=true;
		int n = edges.length;
		for(int i=0;i<n;i++)
		{
			if(edges[sv][i]==1 && !visited[i])
			{
				printDFS(edges,i,visited);
			}
		}
	}
	public static void printDFS(int edges[][])
	{   //this is basically a DFS that is Depth first search
		boolean visited[] = new boolean[edges.length];
		for(int i=0;i<edges.length;i++)
		{
			if(!visited[i])
			printDFS(edges,i,visited);
		}
	}
	
	public static void printBFS(int edges[][])
	{   //this is basically a DFS that is Depth first search
		boolean visited[] = new boolean[edges.length];
		for(int i=0;i<edges.length;i++)
		{
			if(!visited[i])
			printBFS(edges,i,visited);
		}
	}
	public static void printBFS(int edges[][],int sv,boolean visited[])
	{
		Queue<Integer> pending = new LinkedList<>();
		pending.add(sv);
		visited[sv]=true;
		while(!pending.isEmpty())
		{
			int front = pending.poll();
			System.out.println(front);
			int n = edges.length;
			for(int i=0;i<n;i++)
			{
				if(edges[sv][i]==1 && !visited[i])
				{
					pending.add(i);
					visited[i]=true;
				}
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
		System.out.println("DFS");
		printDFS(edges);
		System.out.println("BFS");
		printBFS(edges);
		
	}

}

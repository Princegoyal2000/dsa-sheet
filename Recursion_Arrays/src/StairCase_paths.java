import java.util.ArrayList;

public class StairCase_paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> path = getStairpaths(4);
		System.out.print(path);

	}

	
	private static ArrayList<String> getStairpaths(int n) {
		if(n==0)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
			
		}else if(n<0)
		{
		
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		ArrayList<String> paths1 = getStairpaths(n-1);
		ArrayList<String> paths2 = getStairpaths(n-2);
		ArrayList<String> paths3 = getStairpaths(n-3);
		ArrayList<String> paths = new ArrayList<>();
		for(String path : paths1)
		{
			paths.add(1+path);
		}
		for(String path : paths2)
		{
			paths.add(2+path);
		}
		for(String path : paths3)
		{
			paths.add(3+path);
		}
		return paths;
		
	}

}

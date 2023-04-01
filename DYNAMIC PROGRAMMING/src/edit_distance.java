
public class edit_distance {

	public static int editDistance(String s,String t)
	{
		if(s.length()==0)
			return t.length();
		if(t.length()==0)
			return s.length();
		if(s.charAt(0)==t.charAt(0))
			return editDistance(s.substring(1),t.substring(1));
		else
		{
			int opt1 = editDistance(s,t.substring(1));
			//Insert
			int opt2 = editDistance(s.substring(1),t);
			//Delete
			int opt3 = editDistance(s.substring(1),t.substring(1));
			//Substitute
			
			
			
			return 1+ Math.min(opt1, Math.min(opt2, opt3));
		}
	}
	public static int editDistanceM(String s, String t)
	{
		int storage[][]=new int [s.length()+1][t.length()+1];
		for(int i=0;i<s.length()+1;i++)
			for(int j=0;j<t.length()+1;j++)
				storage[i][j]=-1;
		return editDistanceM(s,t,storage);
	}
	public static int editDistanceM(String s,String t,int storage[][])
	{

		int m = s.length();
		int n = t.length();
		
		if(m==0)
		{
			storage[m][n]=n;
			return storage[m][n];
		}
		
		if(n==0)
		{
			storage[m][n]=m;
			return storage[m][n];
		}
		
		if(storage[m][n]!=-1)
		return storage[m][n];
		
		if(s.charAt(0)==t.charAt(0))
		{
			storage[m][n]= editDistanceM(s.substring(1),t.substring(1),storage);
			return storage[m][n];
		}
		else
		{
			int opt1 = editDistanceM(s,t.substring(1),storage);
			//Insert
			int opt2 = editDistanceM(s.substring(1),t,storage);
			//Delete
			int opt3 = editDistanceM(s.substring(1),t.substring(1),storage);
			//Substitute
			
			
			storage[m][n]= 1+ Math.min(opt1, Math.min(opt2, opt3));
			
		}
		return storage[m][n];
	}
	public static int editDistanceDp(String s, String t)
	{
		int m = s.length();
		int n = t.length();
		int storage[][]= new int[m+1][n+1];

		for(int i=0;i<=m;i++)
		{
			storage[i][0]=i;
		}
		for(int j=0;j<=n;j++)
		{
			storage[0][j]=j;
		}
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
			{
				if(s.charAt(m-i)==t.charAt(n-j))
					storage[i][j] = storage[i-1][j-1];
				else
					storage[i][j] = 1+Math.min(storage[i-1][j],Math.min(storage[i][j-1],storage[i-1][j-1] ));
			}
		return storage[m][n];
	}
	public static void main(String[] args) {
		String s = "degi";
		String t = "begih";
		System.out.println(editDistanceDp(s,t));
		System.out.println(editDistanceM(s,t));
		System.out.println(editDistance(s,t));

	}

}

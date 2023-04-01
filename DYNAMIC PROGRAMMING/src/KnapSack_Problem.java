
public class KnapSack_Problem {

	public static int thief_robber_weight(int weight[], int value[], int maxWeight)
	{
		return thief_robber_weight(weight,value,maxWeight,0);
	}
	private static int thief_robber_weight(int[] weight, int[] value, int maxWeight, int i) {

		if(i == weight.length || maxWeight ==0)
			return 0;
		
		if(weight[i]>maxWeight)
			return thief_robber_weight(weight,value,maxWeight,i+1);
		else
		{
			int opt1 = value[i]+thief_robber_weight(weight,value,maxWeight-weight[i],i+1);
			int opt2 = thief_robber_weight(weight,value,maxWeight,i+1);
			return Math.max(opt1, opt2);
		}
	}
	public static int thief_robber_weightM(int weight[], int value[], int maxWeight)
	{
		int storage[][]=new int[weight.length+1][maxWeight+1];
		for(int i=1;i<storage.length;i++)
			for(int j=1;j<storage[0].length;j++)
			{
				if(j>=weight[i-1])
				{
					if( storage[i-1][j-weight[i-1]]+value[i-1] > storage[i-1][j])
					{
					storage[i][j]=	storage[i-1][j-weight[i-1]]+value[i-1];
					}
							
					else
					{
						storage[i][j]=storage[i-1][j];					
						
					}
				}
				else
				{
					storage[i][j]=storage[i-1][j];	
				}

			}
			return storage[value.length][maxWeight];
		
	}
	
	public static void main(String[] args) {
	
		int weight[]= {6,1,2,4,5};
		int value[]= {10,5,4,8,6};
		int maxWeight=5;
		System.out.println(thief_robber_weightM(weight,value,maxWeight));
		System.out.println(thief_robber_weight(weight,value,maxWeight));

	}

}

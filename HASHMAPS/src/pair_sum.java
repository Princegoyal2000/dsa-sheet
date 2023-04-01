import java.util.HashMap;

public class pair_sum {

	public static void pair(int arr[],int x)
	{
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int val:arr)
//		{
//			map.put(val, 1);
//		}
//		for(int val:arr)
//		{
//			if(map.containsKey(sum-val))
//			{
//				System.out.println(val+" "+(sum-val));
//				int val1=sum-val;
////				val=Integer.MIN_VALUE;
//				
//			}
//		}
        int count=0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i : arr)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for(Integer i : arr)
        {
            
            int val = x-i;
            if(map.containsKey(val))
            {
            	if(val==i)
            	
                    {
                        count += ((map.get(i)-1)*map.get(val))/2;

                    }
                    else
                    {
                        count += map.get(i)*map.get(val);

                    }
            	map.put(val,0);
            	map.put(i, 0);	          		
            }
   
        }
        System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {48, 24, 99, 51, 33, 39, 29, 83, 74, 72, 22, 46, 40, 51, 67, 37, 78, 76, 26, 28, 76, 25, 10, 65, 64, 47 ,34 ,88, 26, 49, 86, 73, 73, 36, 75, 5, 26, 4, 39, 99, 27, 12 ,97, 67 ,63, 15, 3, 92, 90};
		pair(arr,50);

	}

}


public class sort_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,0,1,1,0,0,0};
		int index=0;
		int start=0;
		while(start<arr.length)
		{
			if(arr[start]==0)
			{
				int temp=arr[index];
				arr[index]=arr[start];
				arr[start]=temp;
				index++;
			}
			start++;
		}
		for(int val:arr)
		{
			System.out.print(val+" ");
		}

	}

}

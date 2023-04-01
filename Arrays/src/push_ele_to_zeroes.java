
public class push_ele_to_zeroes {

	public static void push_ele_to_0(int arr[])
	{
//		int index=0;
		int index =0;
//		while(i<arr.length)
//		{
//			if(arr[i]==0)
//			{
//				for(int j=i;j<arr.length-1;j++)
//				{
//					arr[j]=arr[j+1];
//				}
//				arr[arr.length-1]=0;
//			}
//			i++;
//		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,3,1,5,0,2,0};
		push_ele_to_0(arr);

	}

}

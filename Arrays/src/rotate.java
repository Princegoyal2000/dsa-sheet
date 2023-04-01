
public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int k=2;
		int val=arr.length-k;
		int l=0;
		while(l<k)
		{
			int temp=arr[l];
			arr[l]=arr[val];
			arr[val]=temp;
			l++;
			val++;
		}
		for(int u:arr)
			System.out.print(u+" " );

	}

}

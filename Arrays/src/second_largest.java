
public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,7,9};
		int val = second_larg(arr);
		System.out.print(val);

	}

	private static int second_larg(int[] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
//		System.out.println(max);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>sec_max && arr[i]<max)
				sec_max=arr[i];
//			System.out.print(sec_max+" ");
		}
		return sec_max;
	}

}

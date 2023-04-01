public class max_ of_Array {
    public static int max_of_array(int arr[],int idx)
    {
        if(idx==arr.length-1)
            return arr[idx];
        int misa = max_of_array(arr,idx+1);
        if(misa>arr[idx])
        {
            return misa;
        }
        else
        {
            return arr[idx];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,9,1,6,11,3,7};
        System.out.println(max_of_array(arr,0));
    }
}

public class array_print {
    public static void print(int arr[],int idx)
    {
        if(idx==arr.length) return;
        System.out.println(arr[idx]);
        print(arr,idx+1);
    }
    public static void printReverse(int arr[],int idx)
    {
        if(idx==arr.length)return;
        printReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,76};
        print(arr,0);
        printReverse(arr,0);

    }
}

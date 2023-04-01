public class countDigits {

    public static int countDigit(int n,int count)
    {

        if(n==0)
           return count;
        return countDigit(n/10,++count);
    }
    public static void main(String[] args) {
            int a = 214;
        int count=0;
        System.out.println(countDigit(a,count));
    }
}

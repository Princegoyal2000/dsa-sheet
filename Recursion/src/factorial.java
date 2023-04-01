public class factorial {
    public static int fact(int a)
    {
        if(a==0)
            return 1;
        return a*fact(a-1);
    }
    public static void main(String args[])
    {
        int a = 3;
        System.out.println(fact(a));
    }
}

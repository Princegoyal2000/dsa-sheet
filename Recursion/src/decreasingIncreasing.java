import java.util.Scanner;
public class decreasingIncreasing {
    public static void pdi(int n )
    {
        if(n==0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pdi(n);
    }
}

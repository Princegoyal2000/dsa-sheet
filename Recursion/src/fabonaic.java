import java.util.Scanner;
public class fabonaic {
    public static int fabonaic(int n)
    {
        if(n<=1)
            return n;
     return fabonaic(n-1)+fabonaic(n-2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fabonaic(n));

    }
}


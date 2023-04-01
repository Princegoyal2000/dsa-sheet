import java.util.Scanner;
public class Tower_Of_Hanoii {
    public static void T_O_H(int n,int tA, int tB, int tC)
    {
        if(n==0) return;
        T_O_H(n-1,tA,tC,tB);
        System.out.println(n + "[" +  tA + " -> " + tB + "]");
        T_O_H(n-1,tC,tB,tA);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tA = sc.nextInt();
        int tB = sc.nextInt();
        int tC = sc.nextInt();
        T_O_H(n,tA,tB,tC);
    }
}

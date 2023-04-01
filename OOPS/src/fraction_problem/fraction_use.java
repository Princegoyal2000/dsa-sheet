package fraction_problem;

public class fraction_use {
         private int numerator;
         private int denominator;
         public fraction_use(int num,int den)
         {
        	 this.numerator=num;
        	 if(den==0)
        	 {
        		 
        	 }
        	 this.denominator=den;
        	 simplify();
         }
         public void simplify()
         {
        	 int gcd=0;
        	 int smaller=Math.min(numerator, denominator);
        	 for(int i=2;i<=smaller;i++)
        	 {
        		 if(numerator%i==0 && denominator%i==0)
        		 {
        			 gcd=i;
        		 }
        	 }
        	 numerator=numerator/gcd;
        	 denominator=denominator/gcd;
         }
         public void print()
         {
        	 System.out.println(numerator+" "+denominator);
         }
}

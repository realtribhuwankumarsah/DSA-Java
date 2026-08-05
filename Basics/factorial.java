import java.util.*;

public class factorial {
    public static int factorialcaculate (int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact*i;
           
            
        }
         return fact;

    }
    public static int  binomialcoefficient (int n, int r) {
        int factn = factorialcaculate(n);
        int factr = factorialcaculate(r);
        int factnmr = factorialcaculate(n-r);
        int result = factn/(factr*factnmr);
        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter the Value of r: ");
        int r = sc.nextInt();

        System.out.println("The binomial cofficient for n = " +n+" and r = "+r+" is "+binomialcoefficient(n, r));

        sc.close();

        
    }
    
    
    
}

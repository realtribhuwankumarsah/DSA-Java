package Recursion_Backtracking;

public class xToThePowNOptimized {


    public static int printPow(int x,int n) {
        if(n==0) {
            return 1;
        }
        int halfpow = printPow(x, n/2);
        int halfpowsq = halfpow*halfpow;

        if(n%2 != 0) {
            halfpowsq=x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(printPow(x,n));
    }
    
}

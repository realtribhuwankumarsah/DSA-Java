package Recursion_Backtracking;

public class fibonacci {
    public static int fib(int n) {
        if(n==1) {
            return 1;
        }
        if(n==0) {
            return 0;
        }
       int fn = fib(n-1)+fib(n-2);
       return fn;

    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    
}

package Recursion_Backtracking;
public class printXToThePowN {


    //this is a general solution and not optimized it has the time complexity of Big O of n
    // There is another program file with optimized method with time complexity if Big O of Logn

    public static int print(int x, int n) {
        if(n==0) {
            return 1;
        }
        int xnm1 = print(x, n-1);
        int xpn = xnm1*x;
        return xpn;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(print(x,n));
    }
    
}

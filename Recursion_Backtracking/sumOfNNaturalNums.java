package Recursion_Backtracking;

public class sumOfNNaturalNums {

    public static int sum(int n ) {
        if(n==0) {
            return 0;
        }
        int fn = n+sum(n-1);
        return fn;
    }
    public static void main(String[] args) {

        int n = 0;
        System.out.println(sum(n));
    }
    
}

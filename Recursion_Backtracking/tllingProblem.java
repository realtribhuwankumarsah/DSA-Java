package Recursion_Backtracking;

public class tllingProblem {


    public static int tiling(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int totalways = tiling(n-1)+tiling(n-2);
        return totalways;
    }
    public static void main(String[] args) {

        int n = 4;
        System.out.println(tiling(n));
    }
    
}

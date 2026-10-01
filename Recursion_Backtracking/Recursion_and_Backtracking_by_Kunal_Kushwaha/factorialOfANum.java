package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class factorialOfANum {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));;
         
    }
    static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }
}

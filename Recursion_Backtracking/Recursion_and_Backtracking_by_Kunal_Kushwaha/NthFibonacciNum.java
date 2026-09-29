package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class NthFibonacciNum {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }

        //body
        return fibo(n - 1) + fibo(n - 2);
    }
}


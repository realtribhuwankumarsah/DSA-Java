package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(568));
        System.out.println(product(568));
        
    }

    static int sum(int n) {
        if(n==0){
            return 0;
        }
        int Sums = (n%10)+sum(n/10);
        return Sums;
    }
    
    static int product(int n) {
        if(n%10==n){
            return n;
        }
        int prod = (n%10)*product(n/10);
        return prod;
    }
    
}

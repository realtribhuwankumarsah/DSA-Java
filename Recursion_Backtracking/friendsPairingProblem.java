package Recursion_Backtracking;

public class friendsPairingProblem {

    public static int pairing(int n) {
        //Base case 
        if(n == 1 || n == 2) {
            return n;
        }
        //kaam 
        int totalways = pairing(n-1)+((n-1)*pairing(n-2));

        return totalways;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(pairing(n));
    }
    
}

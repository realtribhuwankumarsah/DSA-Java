package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class palindrome {
    public static void main(String[] args) {
        int num = 2552;
        int ans = 0;
        System.out.println(palin(num,print(num, ans)));
        
        
    }

    public static boolean palin(int num, int print) {
        return num==print;
    }
     static int print(int num, int ans) {
        if(num==0) {
            return ans;
        }

            int ld = num%10;
            ans= ans*10+ld;
            return print(num/10, ans);
    }
    
}

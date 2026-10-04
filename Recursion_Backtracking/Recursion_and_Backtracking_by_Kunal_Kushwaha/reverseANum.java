package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class reverseANum {
    public static void main(String[] args) {
        int num = 2569;
        int ans =0;
        System.out.println(print(num, ans));
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

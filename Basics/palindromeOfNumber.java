import java.util.*;
public class palindromeOfNumber {
    public static boolean palindrome(int n) {
        int rev = 0;
        int num = n;
        while(n>0) {
            int ld = n%10;
            rev = ld+rev*10;
            n=n/10; 
        }
        System.out.println(rev);
        if(num==rev) {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is plaindrome: ");
        int n = sc.nextInt();
        System.out.println(palindrome(n));

        
    }
    
}

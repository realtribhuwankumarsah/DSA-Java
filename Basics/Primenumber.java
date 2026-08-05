import java.util.*;

public class Primenumber {
    //Optimized code finding prime number.

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num == 2) {
            isPrime = true;
        }
        else{
            for (int i = 2; i*i <= num; i++) {

            if(num%i==0) {
                isPrime = false;
            }
            else {
                isPrime = true;
            }

            
        }

        }
        if(isPrime) {
            System.out.println("The given numer is a prime Number.");
        }
        else{
            System.out.println("The given number is not a prime number.");
        }
        
        
    }
}
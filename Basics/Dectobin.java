import java.util.*;
public class Dectobin {
    public static int decimaltobinary (int dec) {
        int bin = 0;
        int pow = 0;
    while(dec>0) {
        int rem = dec%2;
        bin = bin + (int)(rem*Math.pow(10, pow));
        pow++;
        dec = dec/2;
        

    }
    return bin;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : " );
        int dec = sc.nextInt();
        

        System.out.println("The decimal to binary for : "+dec+ " will be : " + decimaltobinary(dec));
        
    }
    
}

import java.util.*;
public class bintodec {
    public static int binarytodecimal (int binarynum) {
        
        int pow = 0;
        int decimalnum = 0;

        while(binarynum>0) {
            int lastdigit = binarynum%10;
            decimalnum = decimalnum + (int)(lastdigit*Math.pow(2, pow));
            binarynum=binarynum/10;
            pow++;

        }
        return decimalnum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number : ");
        int n = sc.nextInt();
        System.out.println("The decimal of binary number : "+n+ " is "+ binarytodecimal(n));
        
    }
    
}

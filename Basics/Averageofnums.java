import java.util.*;
public class Averageofnums {
    public static double averageofnum(int num1, int num2, int num3) {
        int average = (num1+num2+num3)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The average of three numbers is :" +averageofnum(num1, num2, num3));
        sc.close();
    }
    
}

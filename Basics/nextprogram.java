import java.util.Scanner;
public class nextprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.print("Enter the Number : ");
        num = sc.nextInt();
        for (int i = 1; i <=num; i++) {
            fact *=i;

            
        }
        System.out.println("The Factorial for "+num+ " is " + fact);

    }
    
}

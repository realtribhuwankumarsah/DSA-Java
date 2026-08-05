import java.util.Scanner;
public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // for (int i = 1; i <=4; i++) {
        //     System.out.println("****");
            
        // }
        // int line = 1;
        // while(line<=4) {
        //     System.out.println("****");
        //     line++;
        // }
        
    //     int n = 10899;
    //    while(n>0) {
    //     int lastdigit = n%10;
    //     System.out.print(lastdigit + " ");
    //     n= n/10;
    //    }
    // int n = 10998, rev = 0 ;
    // while(n>0) {
    //     int ld = n%10;
    //     rev = rev*10+ld;
    //     n/=10;
    // }
    // System.out.println(rev);

    // for (int i = 0; ; i++) {
    //     System.out.print("Enter any numebr: ");
    //     int num = sc.nextInt();
    //     if(num%10==0) {
    //         break;
    //     }
    //     System.out.println(num);
        
    // }
    // for (int i = 1; i < 10; i++) {
    //     if(i==3) {
    //         continue;
    //     }
    //     System.out.println(i);

        
    // }

    // do{
    //     System.out.println("Enter any number: ");
    //     int num = sc.nextInt();
        
    //     if(num%10==0) {
    //         continue;
           
    //     }
    //             System.out.println(num);


    // }
    // while(true);

    // Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
    int evensum = 0;
    int oddsum = 0;
    int choice;

    do{
        for (int i = 1; i <=5; i++) {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if(n%2==0) {
                evensum += n;
            }
            else {
                oddsum +=n;
            }
            
        }
        System.out.println("Do you wish to continue ? press 1 for yes or 0 for no : ");
        choice = sc.nextInt();
    }
    while(choice==1);
    System.out.println("The sum of Even numbers is : " +evensum);
    System.out.println("The sum of Odd numbers is : " +oddsum);

 
}
    
}

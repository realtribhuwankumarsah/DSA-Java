package Recursion_Backtracking;

public class digitsToName {
    public static void main(String[] args) {
        int num = 194701;
        String digits[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
         if (num%10 == 0){
            System.out.print("Last digit cannot be zero !!!!!");
            return;
        }
        else{
            Printnames(num, digits);
        }
        
    }
    public static void Printnames(int num, String digits[]) {
        if(num==0) {
            return;
        }
        int rem = num%10;
       
        

        Printnames(num/10, digits);
        System.out.print(digits[rem]+" ");


    }
    
}

package Recursion_Backtracking;

public class recursionBasics {
    public static void printNumDec(int n) {
        if(n==1) {
            System.out.println(n+" ");
            return;
        }
            System.out.print(n+" ");
        printNumDec(n-1);
        

    }


    public static void printNumInc(int n) {
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        
        printNumInc(n-1);
        System.out.print(n+" ");
       
        
    }




    public static void main(String[] args) {
        int n = 10;

        System.out.println("These are numbers in descreasing order :");
        printNumDec(n);

          System.out.println();

         System.out.println("These are numbers in increasing order :");
         printNumInc(n);

    }
    
}

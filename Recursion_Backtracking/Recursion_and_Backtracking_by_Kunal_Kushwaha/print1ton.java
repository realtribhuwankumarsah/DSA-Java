package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class print1ton {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        print1to5(n);
    }
    
    // This program is for printing from 5 to 1 i.e. 5 4 3 2 1 but what if i want to print 1 to 5 
    static void print(int n) {
        if(n== 0) {
            return;
        }
        
        System.out.println(n);
        print(n-1);
        
    }

      // this program is for printing 1 to 5 because at the end the control will be at n = 1 and while returing it will print 1 so
      // it will print will print while emptying the stack unlike the upper one it was printing stacking in the stcak memory

      static void print1to5(int n) {
        if(n==0) {
            return;
        }
        print1to5(n-1);
        System.out.println(n);
        
    }
    
}

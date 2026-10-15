package Recursion_Backtracking;

public class stringLength {
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(length(str));
        
    }
    
    public static int length(String str) {

        if(str.length()==0) {
            return 0;
        }

        return length(str.substring(1))+1;
    }
}

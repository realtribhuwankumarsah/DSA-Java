package Revision;
import java.util.*;

import Recursion_Backtracking.checkIfArrIsSorted;

public class stringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Tribhuwan";
        String sex = "Male";
        String result = name+ " is a " + sex;
        System.out.println(result);
        // This is called concatenation, joining Strings....

      //Charindex(sc);
      //sc.close();

      String str = "racecar";
      System.out.println(Checkpalindrome(str));
        
    }
    
     static void Charindex(Scanner sc) {
        System.out.println("Enter Your Full name ....");
        String Naam = sc.nextLine();
        System.out.println(Naam.charAt(0));
         System.out.println(Naam.charAt(7));
          System.out.println(Naam.charAt(1));
           System.out.println(Naam.charAt(2));
            System.out.println(Naam.charAt(4));
             System.out.println(Naam.charAt(5));
              System.out.println(Naam.charAt(6));
     //This is called printing idices of a string   
     
     //printing the length of the string
     System.out.println(Naam.length());
    }

    public static boolean Checkpalindrome(String str) {
        for (int i = 0; i <str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {

                return false;
            }
           
            
        }
        return true;
    }
    
}

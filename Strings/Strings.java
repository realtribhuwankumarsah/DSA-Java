package Strings;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //it inputs only a word
        String name1 = sc.nextLine();//it inputs the whole sentence 
        System.out.println(name);
        System.out.println(name1);


        //String length
        String name2 = "Tribhuwan kumar sah ";
        System.out.println(name2.length());


        //Concatenation
        // String firstname = "Tribhuwan";
        // String lastname = "Sah";
        // String fullname = firstname+" "+lastname;
        // System.out.println(fullname);


        //charAt / Character index
        // String name3 = "Manisha";
        // System.out.println(name3.charAt(5)); 
        // System.out.println();
        // System.out.println();


        // String Name = "Manisha";
        // printLetters(Name);

        // String word = "madhu";
        // Palindrome(word);
        // System.out.println(Palindrome1(word));

        System.out.println(Shortestpath("WNEENE"));


        
        
    }
    
        //Printing all charcter in the string 
        public static void printLetters(String Name) {
            for (int i = 0; i < Name.length(); i++) {
                System.out.print(Name.charAt(i)+" ");
                
            }
        }

        //Check if a String is a Palindrome
        public static boolean Palindrome(String word) {
            int start = 0;
            int end = word.length()-1;

            while(start<end) {
                    if(word.charAt(start)!=word.charAt(end)) {
                        System.out.println("Not a palindrome !");
                        return false;
                       
                    }
                     start++;
                     end--;
                   
                    
                    
                }
                 System.out.println("The given String is a Palindrome.");
                    return true;
            


        }
        //palindrome using for loop
        public static boolean Palindrome1(String word) {

                    for (int i = 0; i < word.length()/2; i++) {
                        
                    
                    if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
                        System.out.println("Not a palindrome !");
                        return false;
                       
                    }
                    
                    
                }
                 System.out.println("The given String is a Palindrome.");
                    return true;
            }


    
    
    //Shortest path problem
    public static float Shortestpath(String dir) {
        int x = 0;
        int y = 0;

        for (int i = 0; i <dir.length(); i++) {
            // char d = dir.charAt(i);
            
            //south
            if(dir.charAt(i)=='S') {
                y--;
            }
            //north
            else if(dir.charAt(i)=='N') {
                y++;
            }
            //east
            else if(dir.charAt(i)=='E') {
                x++;
            }
            //west
            else {
                x--;
            }

        }
        int xsq = x*x;
        int ysq = y*y;
        int sum = xsq+ysq;
        float result = (float)Math.sqrt(sum);
        return result;
    

    }
            


        

    
}

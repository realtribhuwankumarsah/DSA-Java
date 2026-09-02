package Revision;

public class patternPrinting {

    //print a rectangle with n number of columns
    public static void rectanlgeStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }

    }



    public static void invertedHalfPyramid(int n) {
        for (int i = 0; i < n; i++) { 
            for (int j = n; j > i; j--) {
                System.out.print("* ");

                
            }
            System.out.println();
            
        }
    }


    
    public static void main(String[] args) {
        invertedHalfPyramid(4);
        
    }
    
}

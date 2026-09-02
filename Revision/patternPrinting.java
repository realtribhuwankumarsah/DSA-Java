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
    //Half inverted pyramid printing 
    public static void invertedHalfPyramid(int n) {
        for (int i = 0; i < n; i++) { 
            for (int j = n; j > i; j--) {
                System.out.print("* ");

                
            }
            System.out.println();
            
        }
    }
    public static void halfPyramid(int n) {
        //Printing half pyramid 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
    //Print half Pyramid with numbers
    public static void numberedHalfPyramid(int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }
    //Print contionous English Alphabet Pattern
    public static void alphabetPattern(int n) {
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(c+" ");
                c++;
                
            }
            System.out.println();
            
        }
    }
    //printing hollow rectangle pattern
    public static void hollowRectangle(int col, int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i==1||i==row || j == 1||j == col) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        //alphabetPattern(4);
        hollowRectangle(5, 4);
        
    }
    
}

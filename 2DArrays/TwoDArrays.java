import java.util.*;
public class TwoDArrays {


    public static boolean  searchInTwoDArray(int matrix[][], int key) {
        //printing the matrix element
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key) {
                    System.out.println("Key found at cell : ("+i+","+j+")");
                    return true;
                }
            
                
            }
            System.out.println();
            
            
         }
         System.out.println("This key do not exist in the matrix.....");
         return false;

    }

    public static void  printing (int matrix[][]) {
        //printing the matrix element
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+", ");
                
            }
            System.out.println();
            
            
         }
         

    }

    public static void largestint(int matrix[][]) {
        int largestElement= Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largestElement=Math.max(largestElement, matrix[i][j]);

                
                
            }
            
            
         }
         System.out.println("The largest element is :"+largestElement);
         
    }

    
    public static void main(String[] args) {
        

        //Creating an 2D array
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        //Taking input the matrix elements
        System.out.println("Enter the elements of the matrix:");
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
                
            }
            
        }

        printing(matrix);
        searchInTwoDArray(matrix,5);
        largestint(matrix);
         

    }
    
}

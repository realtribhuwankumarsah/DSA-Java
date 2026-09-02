public class spiralMatrix {
    public static void printSpiralMatrix(int matrix[][]) {
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;

        while(top <= bottom && left <= right) {
            //top
            for (int i = left; i <= right; i++) {
                System.out.print(" "+matrix[top][i]);
                
            }
            top++;

            //right
            for (int j = top; j <= bottom; j++) {
                System.out.print(" "+matrix[j][right]);
                
            }
            right--;

            //bottom
            if(top<=bottom) {
            for (int k = right; k >=left; k--) {
                
                System.out.print(" "+matrix[bottom][k]);
                
            }
            bottom--;
        }

            //left
            if(left<=right) {
            for (int l = bottom; l >= top; l--) { 
                
                System.out.print(" "+matrix[l][left]);
                
            }
            left++;
        }
        }
        
    }

    //diagonal sum
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;

        //Primary diagonal sum. This is brute force approach
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j) {
                    sum= sum+matrix[i][j];
                }
                else {
                    //for secondary diagonal
                    if(i+j==matrix.length-1) {
                        sum += matrix[i][j];

                }
                }
                    
                
            }
            
        }
        System.out.println(sum);
    }

    //Diagonal sum. Better approach/optimized approach.
    public static void betterDiagonalsum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            //for primary diagonal
            sum+=matrix[i][i];
            //for secondary diagonal
            sum+= matrix.length-1-i;
        }
        if(matrix.length%2==0) {
            sum = sum-matrix[matrix.length/2][matrix.length/2];
        }
        System.out.println(sum);
    }

    //search in sorted matrix

    //Brute force approach
    public static void seachInmatrix(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(key==matrix[i][j]) {
                    System.out.println("{"+i+","+j+"}");
                }
                
            }
            
        }
        
        


    }

    //Better approach/ Binary Search
    public static boolean search(int matrix[][], int key) {

    for (int i = 0; i < matrix.length; i++) {

        int start = 0;
        int end = matrix[i].length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (matrix[i][mid] == key) {
                System.out.println("("+i+","+mid+")");
                return true;
            }
            else if (matrix[i][mid] > key) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
    }

    return false;
}

    

    public static void main(String[] args) {
        int matrix[][] = { {10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}
                           };


       //printSpiralMatrix(matrix); 
       //diagonalSum(matrix);
       //seachInmatrix(matrix, 35);
       search(matrix, 48);


    }
    
}

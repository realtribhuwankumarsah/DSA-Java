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
    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,4},
                           {5,6,7,8},
                           {9,1,2,3},
                           {9,8,7,6}
                           };


       printSpiralMatrix(matrix);                    
    }
    
}

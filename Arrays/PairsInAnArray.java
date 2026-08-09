package Arrays;

public class PairsInAnArray {
    public static void arraypairs(int arr[]) {
        int counter=0;
        for (int i = 0; i <=arr.length-1; i++) {
            for (int j = i+1; j <=arr.length-1; j++) {
                System.out.print("{"+arr[i]+","+arr[j]+"} ");
                counter++;
                
            }
            System.out.println();
            
        }
        System.out.println();
        System.out.println("Total number of pairs :" +counter);

    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,9,6};
        arraypairs(arr);

        
    }
    
}

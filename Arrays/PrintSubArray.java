public class PrintSubArray {
public static void PrintSub(int arr[]) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                    sum = sum+arr[j2];
                }
                 if(sum>=maxValue) {
                        maxValue=sum;
                    }
                    if(sum<minValue){
                        minValue=sum;
                    }
                System.out.println("  : sum ="+sum);
                System.out.println();
                
                
            }
            System.out.println();
            System.out.println("The Largest sum is :" +maxValue);
            System.out.println("The smallest sum is : " + minValue);
            
        }
    }

public static void main() {
    //pass an array
    int arr[] = {5,5,6,2,3,6};
    PrintSub(arr);

}
}
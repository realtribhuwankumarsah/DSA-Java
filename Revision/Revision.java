package Revision;
import java.util.*;
public class Revision {
    public static int BinarySearch(int arr[], Scanner sc) {
        System.out.println("Enter the Value to search : ");
        int key = sc.nextInt();
        int start=0;
        int end = arr.length-1;
        while(start <= end) {
          int mid = (start+end)/2;
            //Comparisons
            if(key==arr[mid]) {
                return mid;
            }
            if(arr[mid]>key) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        
        return -1;
    }


    
    public static int[]  ArrayCretion(Scanner sc) {
        
        System.out.print("Enter an integer value of how large An Array do you want : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Now Enter the elements of the array : ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            
            
        }
        
        System.out.println();
        return arr;
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();


    }






    public static void PrintSubArray(int arr[]) {
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



    public static void PairsInArray(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("{"+arr[i]+"," +arr[j] +"}");
                totalPairs++;
                
            }
            System.out.println();
            
        }
        System.out.println(totalPairs);
    }





    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =ArrayCretion(sc);
        //Arrays.sort(arr);
        PrintArray(arr);
        
        int result = BinarySearch(arr,sc);
        System.out.println(result);
        PairsInArray(arr);
        PrintSubArray(arr);

        

        
    }
    
}

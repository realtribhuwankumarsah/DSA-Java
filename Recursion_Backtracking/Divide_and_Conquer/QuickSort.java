package Recursion_Backtracking.Divide_and_Conquer;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = {5,3,9,1,2,8};
        System.out.println("Before:....");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("After:....");
        
        sort(arr,0,arr.length-1);

    }
    public static void sort(int []arr, int lowindex, int highindex) {
        int pivot = arr[highindex];

        int i = lowindex-1;

        for (int j = 0; j < highindex; j++) {
            if (arr[j]<=pivot) {
                i++;

                //swap
                int temp = arr[i];
                arr[j] =arr[i];
                arr[i]=temp;
                
            }
            
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
            
        }
        
            
        }
    }
    


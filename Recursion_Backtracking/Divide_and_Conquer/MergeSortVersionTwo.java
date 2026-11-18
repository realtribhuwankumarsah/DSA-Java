package Recursion_Backtracking.Divide_and_Conquer;

public class MergeSortVersionTwo {
    public static void main(String[] args) {
        int arr[] = {5,2,6,9,7,1};
        mergesortv2(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesortv2(int []arr, int start, int end) {
        // base case 
        if (start>=end) {
            return; 
        }
        int mid = (start+end)/2;
        mergesortv2(arr, start, mid);
        mergesortv2(arr, mid+1, end);

        mergev2(arr,start,mid,end);
    }
    

    public static int[] mergev2(int[]arr, int start, int mid,int end) {

        int[] temp = new int[end-start+1];
        
    }

}

    

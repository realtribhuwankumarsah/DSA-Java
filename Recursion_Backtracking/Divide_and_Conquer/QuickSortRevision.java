package Recursion_Backtracking.Divide_and_Conquer;

public class QuickSortRevision {
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static void quicksort(int arr[], int si, int ei) {
        //base case
        if (si>=ei) {
            return ;
        }
        //pivot element-> last element
        int partitionindex = partition(arr, si, ei);
        quicksort(arr, si, partitionindex-1);
        quicksort(arr, partitionindex+1, ei);

    }


    static int partition(int arr[], int si, int ei) {
        int pivot= arr[ei];
        int i = si-1;
        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                
            }
            
        }
        //swap pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]= temp;
        return i;
    }
    
}

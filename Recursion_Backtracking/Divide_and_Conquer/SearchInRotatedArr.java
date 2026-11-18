package Recursion_Backtracking.Divide_and_Conquer;

public class SearchInRotatedArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,0,1,2};
        int target = 0; //output = 3
         int idx = search(arr,target,0,arr.length-1);
         System.out.println(idx);

    }
    static int search(int arr[], int target, int si, int ei) {
        int mid = si+(ei-si)/2;

        //base case/ or mid case
        if (arr[mid]==target) {
            return mid;
            
        }

        //case 1-> mid on line 1
        if (arr[si]<=arr[mid]) {
            //case a
            if (arr[si]<=target && target <= arr[mid]) {
                return search(arr, target, si, mid-1);
            }
            else{
                return search(arr, target, mid+1, ei);
            }
            
        }

        //case 2 -> mid on line 2
        else{
            if (arr[mid]<=target && target<= arr[ei]) {
                return search(arr, target, mid+1, ei);
            }
            else {
                return search(arr, target, si, mid-1);
            }

        }
    }
    
}

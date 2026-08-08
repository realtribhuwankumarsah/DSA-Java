package Arrays;

public class BinarySearch {

    public static int binarysearch (int arr[], int key) {
        int start = arr[0];
        int end = arr.length-1;
        
        while(start<=end) {
            int mid = (start+end)/2;
            if(mid==key) {
                return mid;
            }
            if(mid<=key) {
                end=arr[mid]-1;
            }
            if(arr[mid]>=key) {
                start=arr[mid]+1;

            }
            
        }
       
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        int key = 10;
        binarysearch(arr,key);
    }
    
}

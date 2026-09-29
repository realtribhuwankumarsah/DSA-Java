package Recursion_Backtracking.Recursion_and_Backtracking_by_Kunal_Kushwaha;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,10,19,29};
        int s = 0;
        int e = arr.length-1;
        int key = 29;
        System.out.println(search(arr,s,e,key));
        
    }
    static int search(int []arr, int s, int e, int key) {
        if(s>e) {
            return -1;
        }
        int m = (s+e)/2;
        if(arr[m]==key) {
            return m;
        }
        if(key>arr[m]) {
            return search(arr, m+1, e, key);
        }


        return search(arr, s, m-1, key);
    }
    
}

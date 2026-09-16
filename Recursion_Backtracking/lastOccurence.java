package Recursion_Backtracking;

public class lastOccurence {


    //This is my method and one of the best method because starting the end of the array the first occurrence of the key in the array will be the last occurrence of the problem, that's the whole idea.
    // I have also solved this problem with another approach like using forward traversing approach in another file 
    // rating this method 9/10 -------- another method = 8/10.

    public static int lastOccr(int arr[], int n, int i) {
        if(i==-1) {
            return -1;
        }
        if(arr[i]==n) {
            return i;
        }
        return lastOccr(arr, n, i-1);
    }
    public static void main(String[] args) {
        
        int arr[] = {2,3,5,6,9,5,6};
        int n = 6;
        int i = arr.length-1;
        System.out.println(lastOccr(arr,n,i));
    }
    
}

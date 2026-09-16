package Recursion_Backtracking;

public class firstOccurence {


    public static int firstOccr(int arr[], int n, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i]==n) {
            return i;
        }
        return firstOccr(arr, n, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,8,3};
        int n = 3;
        int i = 0;
        System.out.println(firstOccr(arr,n,i));
    }
    
}

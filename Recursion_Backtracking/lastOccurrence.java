package Recursion_Backtracking;

public class lastOccurrence {

    public static int lastoccr(int arr[],int key,int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastoccr(arr, key, i+1);

        if(isFound== -1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int []arr = {2,3,5,6,5,6};
        int key = 6;
        int i = 0;
        System.out.println(lastoccr(arr,key,i));
    }
    
}

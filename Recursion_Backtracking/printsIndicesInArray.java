package Recursion_Backtracking;

public class printsIndicesInArray {

    public static void printIndex(int arr[], int key, int i) {
        //base case 
        if(i==arr.length) {
            return;
        }
        if(arr[i]==key) {
            System.out.print(i+" ");
        }
        printIndex( arr,  key,  i+1);

    }
    public static void main(String[] args) {
        int [] arr = {3,2,4,5,6,2,7,5,2};
        int key = 2;
        int i = 0;
        printIndex(arr,key, i);
    }
    
}

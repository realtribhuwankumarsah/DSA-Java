package Recursion_Backtracking.Divide_and_Conquer;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        
        arr = Divide(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        
    }
    static int[] Divide(int[] arr) {
        //base case
        if(arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;

        int[] left = Divide(Arrays.copyOfRange(arr,0,mid));
        int [] right = Divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

     static int[] merge(int []left, int []right) {
        int []newarr=new int[left.length+right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                newarr[k]=left[i];
                i++;
            }else {
                newarr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            newarr[k]=left[i];
            k++;
            i++;
            
        }
        while (j<right.length) {
            newarr[k]=right[j];
            j++;
            k++;
            
        }
        return newarr;
        
    }
    
}

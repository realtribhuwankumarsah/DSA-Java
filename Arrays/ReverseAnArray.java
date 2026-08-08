package Arrays;

public class ReverseAnArray {
    public static void Reverse(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,1,5,6};
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
        
    }
    
}

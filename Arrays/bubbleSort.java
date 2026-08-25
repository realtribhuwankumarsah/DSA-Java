public class bubbleSort {
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                
            }
            
            
        }
        for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
                
            }

    }
    public static void main(String[] args) {
        int arr[] = {5,8,6,1,2,3,8};
        bubblesort(arr);
        
    }
    
}

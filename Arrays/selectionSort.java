public class selectionSort {
    public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    
    //outerloop=Turns/Paases
    for (int i = 0; i < arr.length-1; i++) {
        int minValueIndex = i;
        //InnerLoop = Seaching for Minimum Value
        for (int j = i+1; j < arr.length; j++) {
        if(arr[minValueIndex]>arr[j]) {
            minValueIndex=j;

        }
       

            
        }
         //Swapping the Values
        int temp = arr[i];
        arr[i]=arr[minValueIndex];
        arr[minValueIndex] = temp;
        
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        
    }
    }
    
}

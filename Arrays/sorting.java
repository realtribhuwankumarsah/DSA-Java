public class sorting {
    public static void bubbleSort(int arr[]) {
          for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
                
            }
            
            
          }
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
          }
    }


    public static void selectionSort(int arr[]) {
        //Ascending order Sorting
        for (int i = 0; i < arr.length-1; i++) {
            int SmallValueindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[SmallValueindex]>arr[j]) {
                SmallValueindex=j;
                }   
                
            }
             //Swap-Ascending Order
                    int temp = arr[SmallValueindex];
                    arr[SmallValueindex]= arr[i];
                    arr[i]=temp;
            
        }
        System.out.print("In Ascending Order : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }


        //Descending Order Sorting
        System.out.println();
        System.out.print("In Descending Order : ");
        for (int i = 0; i < arr.length-1; i++) {
           int SmallValueindex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[SmallValueindex]<arr[j]) {
                    SmallValueindex=j;
                }

                
            }
            int temp = arr[SmallValueindex];
            arr[SmallValueindex]=arr[i];
            arr[i]=temp;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }

    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {  //it tracks only the unsorted arr (on the right side) i = 0 not taken because it is already considered as sorted array.
            int currentValue = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>currentValue ) {
                    
                    arr[j+1]=arr[j];
                    j--;
                    
                
            }
            arr[j+1]=currentValue;
            
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,9,8,6,3,7,9,3,5,9};
        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);

    }
    
}

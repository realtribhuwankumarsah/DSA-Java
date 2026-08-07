package Arrays;
import java.util.*;


public class ArrayBasics {
    public static void creationandprint(Scanner sc) {
        int arr[] = new int[5]; 
        System.out.println("Enter the elements of the array of integer type :");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //update the element 
        System.out.println(arr[4]+1);

        //length of an array using array.length
        System.out.println("The size of the array is : " + arr.length);
    }



    public static int LargestNum (int array[]) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>num) {
                num=array[i];
            }
            
            
        }
        return num;
    }


    public static int LinearSearch(int array[]) {
        System.out.print("Enter the element to find : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            //key element = 88
            if(n==array[i]) {
                return i;
            }
            
        }
        in.close();
        return -1;

    }











    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {5,8,6,2,3,11,88,65,1,23,5,6};
        
        //creationandprint(sc);
        // int m =LinearSearch(array);
        // if(m==-1) {
        //     System.out.println("Entered element wasn't found.");

        // }
        // else {
        //     System.out.println("Entered element was found at "+m+ " index");
        // }


        
        System.out.println( LargestNum(array));
        sc.close();
    } 
}     

/*Java always passes arguments by value. For arrays, the value being passed is the reference to the array.

This means:

A copy of the reference is passed to the method.
Both the original reference and the copied reference point to the same array.
Therefore, changes to the array elements inside the method are visible outside the method.*/
     
    


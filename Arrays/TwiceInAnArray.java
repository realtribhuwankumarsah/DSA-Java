import java.util.Arrays;

public class TwiceInAnArray {
    //This problem is for returning true or false if there is the presence of a number twice in an array or totally unique respectively.

    public static boolean  istwice (int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    return true;
                    }
            }
        }
        return false;
        
        
        
    }
    public static void main(String[] args) {
        int arr[] = {5,6,3,3,6,5,3,2,3};
        Arrays.sort(arr);
        System.out.println(istwice(arr));
    }
    
}

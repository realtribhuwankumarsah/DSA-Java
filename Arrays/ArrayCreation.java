public static int[]  ArrayCretion(Scanner sc) {
        
        System.out.print("Enter an integer value of how large An Array do you want : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Now Enter the elements of the array : ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            
            
        }
        
        System.out.println();
        return arr;
    }

    public static void main () {
        //pass an array to arraycreation
        


    }
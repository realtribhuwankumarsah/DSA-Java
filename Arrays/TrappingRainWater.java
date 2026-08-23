public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        //Creating Auxillary Array
        int LeftMaxBoundry[] = new int[arr.length];
        LeftMaxBoundry[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            LeftMaxBoundry[i]=Math.max(arr[i], LeftMaxBoundry[i-1]);
        
            
            }
             
        int RightMaxBoundry[] = new int[arr.length];
        RightMaxBoundry[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            RightMaxBoundry[i]=Math.max(arr[i], RightMaxBoundry[i+1]);
        } 
        int watersum = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterlevel = Math.min(LeftMaxBoundry[i], RightMaxBoundry[i]);
             watersum+=waterlevel-arr[i];
            
        }
        System.out.println(watersum);
    }
    
}

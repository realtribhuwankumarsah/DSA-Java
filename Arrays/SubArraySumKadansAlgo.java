public class SubArraySumKadansAlgo {
    public static void kadansAlgorithm ( int arr[] ) {
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            CurrentSum=CurrentSum+arr[i];
            MaxSum=Math.max(CurrentSum,MaxSum);
            if(CurrentSum<0) {
                CurrentSum=0;
            }
            

            
        }
        System.out.println(MaxSum);

    }
    public static void main(String[] args) {
        int arr[] = {-1,-8,-6,-9,-5};
        kadansAlgorithm(arr);
    }
    
}

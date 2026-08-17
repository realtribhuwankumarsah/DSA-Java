public class MaxSubArraySumUsingPrefix {

    public static void subarraysum(int arr[] ) {
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
            
        }
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                sum = i == 0 ? prefix[j]: prefix[j]-prefix[i-1];
                if(sum>maxsum) {
                    maxsum=sum;
                }   
            }
            
            
        }
        System.out.println("The maximum sub array sum is : "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subarraysum(arr);
    }
    
}

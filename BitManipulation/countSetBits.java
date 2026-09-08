public class countSetBits {
    public static void main(String[] args) {
        int n = 15;
        int count =0;
        while(n>0) {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;

        }
        System.out.println(count);


        System.out.println(OptimizedCountSetBits(15));
    }



    //Optimized approach
    public static int  OptimizedCountSetBits(int n ) {
        int count = 0;
        while(n>0) {
            n=n&(n-1);
            count++;
        }
        return count;
    }
    
}

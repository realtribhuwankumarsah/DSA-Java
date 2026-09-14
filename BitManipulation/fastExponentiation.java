public class fastExponentiation {
    public static void main(String[] args) {
        int n = 3; //This is base.
        int x = 5; // This is power.
        int ans = 1;
        while(x>0) {
            if((1&x)!=0) {
                ans = ans*n;
            }
            n=n*n;
            x=x>>1;
        }
        System.out.println(ans);
    }
    
}

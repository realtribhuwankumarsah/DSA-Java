public class clearLastIBits {
    public static void main(String[] args) {
        
    
    int n = 15;
    int i = 2;
    int bitmask = (~0<<i);
    int result = (n&bitmask);
    System.out.println(result);
    }
    
}

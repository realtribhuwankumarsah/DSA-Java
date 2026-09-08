public class clearBitInRange {
    public static void main(String[] args) {
        int n = 97;
        int i = 2;
        int j = 5;
        int bitmask = ((~0)<<(j+1)) | ((1<<i)-1);
        int result = bitmask&n;
        System.out.println(result);
    }
    
}

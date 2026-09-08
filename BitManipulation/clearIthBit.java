public class clearIthBit {
    public static void main(String[] args) {
        int i = 3;
        int n = 10;
        int bitmask = ~(1<<i);
        System.out.println(bitmask&n);
    }
    
}

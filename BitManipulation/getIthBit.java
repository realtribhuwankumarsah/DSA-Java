public class getIthBit {
    public static void main(String[] args) {
        int n = 4; //Any integer number 
        int i = 2; //bit position to find
        int bitmask = 1<<i;

        if((n&bitmask)==0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
    
}

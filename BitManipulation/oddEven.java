public class  oddEven {
    public static void main(String[] args) {
        int n=5;
        int bitmask= 1;
        if((bitmask&n)==0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("the number is odd.");
        }
    }
    
}

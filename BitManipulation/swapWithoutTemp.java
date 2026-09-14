public class swapWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+ " and " + b);
        System.out.println(Integer.toBinaryString(10));
    }
    
}

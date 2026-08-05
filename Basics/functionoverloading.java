public class functionoverloading {
    //functionoveloading using data types.
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum (float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {

        System.out.println("sum of 2 and 4 is "+sum(2, 4));
        System.out.println("sum of 2.5 and 3.6 is " + sum(2.4f, 3.6f));

        
    }
    
}

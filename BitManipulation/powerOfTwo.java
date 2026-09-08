public class powerOfTwo {
    public static void main(String[] args) {
        //check if the number is power of 2 or not 
        int n = 10;
        if((n>0) && (((n-1)&n)==0) ) {
             System.out.println("Number is power of 2.");
        } else {
            System.out.println("Number is not the power of 2.");
        }
    }
    
}

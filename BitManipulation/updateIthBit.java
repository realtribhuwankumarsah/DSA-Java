public class updateIthBit {
    public static void main(String[] args) {
        int n= 10;
        int i =3;
        int newbit=0;
        int bitmask = 1<<i;
        if(newbit==0) {
            //update to 0 using ~ and &
            System.out.println("Number with updated bit is"+(n&~(bitmask)));
        } else {
            //update to 1 using | and left shift
            System.out.println("Number with updated bit is " + (n|bitmask));
        }
    }
    
}

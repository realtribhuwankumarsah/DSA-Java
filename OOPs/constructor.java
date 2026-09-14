package OOPs;

public class constructor {
    public static void main(String[] args) {
       boy s1 = new boy();

       System.out.println(s1.roll);
       System.out.println(s1.name);
       System.out.println(s1.presence);
        
    }

}
//class
    class boy {
        int roll;
        String name;
        boolean presence;

        boy() {
            roll = 25;
            name = "Tribhuwan";
            presence = true;
        }



    }

    

    
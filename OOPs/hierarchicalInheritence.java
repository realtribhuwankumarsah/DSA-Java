package OOPs;

public class hierarchicalInheritence {
    public static void main(String[] args) {


        animal A1 = new animal();
        System.out.println(A1.name);
        System.out.println(A1.legs);
        System.out.println(A1.horns);
        A1.eats();
        A1.sleeps();



        dog D1 = new dog();
        System.out.println(D1.horns);
        System.out.println(D1.legs);
        System.out.println(D1.name);
        D1.sleeps();
        D1.eats();


        horse H1 = new horse();
        System.out.println(H1.name);
        System.out.println(H1.legs);
        System.out.println(H1.horns);
        H1.runs();

        
    }
    
}

class animal{
    String name;
    int legs;
    int horns;


    public  void eats() {
        System.out.println("animal eats :");
    }

    public  void sleeps() {
        System.out.println("animal sleeps :");
    }

}

class dog extends animal {

    //constructor
    public dog() {
        name = "mani";
        legs =4;
        horns = 0;
    }
    
    
}

class horse extends animal{
    public horse() {
        name = "Big horse";
        legs = 4;
        horns = 0;
    }
     public void runs() {
            System.out.println("Horse runs very fast:");
        }
}

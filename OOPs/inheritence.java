package OOPs;

public class inheritence {
    public static void main(String[] args) {

        dog d1 = new dog();
        System.out.println(d1.legs);
        System.out.println(d1.eyes);
        System.out.println(d1.name);
        d1.eat();


        puppy p1 = new puppy();
        System.out.println(p1.name);
        System.out.println(p1.legs);
        System.out.println(p1.eyes);
        p1.eat();
        p1.drink();
        
    }
    
}
class animal{
    int legs;
    int eyes = 2;
    String name;

    public void eat() {
        System.out.println("Eats food");
    }
}
class dog extends animal{

    //constructor
    public dog() {
        legs=4;
        name = "rocky";

    }

}

class puppy extends dog{
    
    //constructor
    public puppy() {
        name = "puppy";
    }

    public void drink() {
        System.out.println("Drinks milk");
    }
    

}

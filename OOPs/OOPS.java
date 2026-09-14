package OOPs;

public class OOPS {
    //This program is for classes and objects.
    //we will create a pen class and apply different opps concepts
    public static void main(String args[]) {

        //Creating new pen object called p1.
        Pen p1 = new Pen();


        p1.SetColor("Dark blue");
        System.out.println(p1.color);

        p1.SetTip(5);
        System.out.println(p1.tip);
        
    }

}


//creatiing pen class
    class Pen{
        String color; //these are properties
        int tip;

        void SetColor(String newColor) { //this is a function or behaviour that changes the previous color of the pen to new color newColor given by user.
            color = newColor;
        }

        void SetTip(int newTip) {
            tip = newTip; //this function sets the tipsize of the pen according to the given newTip.
        }


       
    }
        
    



  

   
    

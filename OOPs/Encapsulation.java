package OOPs;
public class Encapsulation {
    public static void main(String[] args) {

        //Object Creation
        Employee E1 = new Employee();

        E1.setName("Manisha");
        E1.setSalary(1255300);

        System.out.println(E1.getname());
        System.out.println(E1.getSalary());

        
    }
    
}
class Employee {
        private String name;
        private double salary;

        //Constructor
        Employee() {
            name = "Tribhuwan";
            salary = 100000;
        }

        //Setter for name 
        public void setName(String name ) {
            this.name = name;
        }

        //Stter for salary
        public void setSalary(double salary) {
            if(salary>0) {
                this.salary=salary;
            }
        }

        //Getter for name 
        public String getname() {
            return name;
        }

        //Gettr for salary
        public double getSalary() {
            return salary;
        }
    }

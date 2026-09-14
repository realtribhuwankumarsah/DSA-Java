package OOPs;

public class GetterAndSetter {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
       System.out.println(b1.name);
       System.out.println(b1.accnumber);

       b1.setpass("mani");

       b1.setpass("manisha");
       
       System.out.println(b1.getpass());
    }
}

class BankAccount {
        String name;
        String accnumber;
        private String pass;

        BankAccount() {
            name = "Tribhuwan";
            accnumber = "0515322065";
            pass = "mani";
        }

        public void setpass(String pass) {
            //setter
           this.pass = pass;
        }
         //getter
         public String getpass() {
            return pass;
         }



    }
